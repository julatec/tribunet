package name.julatec.ekonomi.tribunet;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;
import static name.julatec.ekonomi.tribunet.PhonePrefix.prefixFor;

public class Clave implements Comparable<Clave> {

    public static final int LENGTH;
    public static final String FORMAT;

    static {
        int tempLength = 0;
        StringBuilder tempFormat = new StringBuilder();
        for (Field field : Field.values()) {
            tempLength += field.length;
            tempFormat.append(field.format);
        }
        LENGTH = tempLength;
        FORMAT = tempFormat.toString();
    }

    private final String country;
    private final Date date;
    private final String id;
    private final String sequence;
    private final Situation situation;
    private final String checksum;
    private final BigInteger value;

    public Clave(String country, Date date, String id, String sequence, Situation situation, String checksum) {
        this.value = new BigInteger(format(FORMAT,
                prefixFor(country).substring(1),
                new SimpleDateFormat("ddMMyy").format(date),
                id != null ? id : "0",
                sequence != null ? situation : "0",
                situation,
                checksum).replace(' ', '0'));
        this.country = country;
        this.date = date;
        this.id = id;
        this.sequence = sequence;
        this.situation = situation;
        this.checksum = checksum;
    }

    public static Clave of(String value) throws ParseException {
        requireNonNull(value);
        int i = 0;
        final String country = PhonePrefix.countryFor(value.substring(i, i += Field.Country.length));
        final Date date = new SimpleDateFormat("ddMMyy").parse(value.substring(i, i += Field.Date.length));
        final String id = value.substring(i, i += Field.Emitter.length);
        final String sequence = value.substring(i, i += Field.Sequence.length);
        final Situation situation = Situation.values()[Integer.valueOf(value.substring(i, i += Field.Situation.length))];
        final String checksum = value.substring(i, i += Field.Checksum.length);
        return new Clave(country, date, id, sequence, situation, checksum);
    }

    public static Clave of(String country, Date date, String id, String sequence) {
        Situation situation = Situation.SITUATION;
        String checksum = String.valueOf(Math.abs(new HashCodeBuilder()
                .append(country)
                .append(date)
                .append(id)
                .append(sequence)
                .toHashCode()));
        checksum = format(Field.Checksum.format, checksum.substring(Math.max(0, checksum.length())));
        return new Clave(country, date, id, sequence, situation, checksum);
    }

    public UUID toUuid() {
        try {
            String string = toString();
            string = string.substring(Field.Country.length, string.length() - Field.Checksum.length);
            BigInteger bigInteger = new BigInteger(string);
            string = format("%32s", bigInteger.toString(16)).replace(' ', '0');
            return UuidFormatter.uuidFromString(string);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int compareTo(Clave that) {
        return new CompareToBuilder()
                .append(this.date, that.date)
                .append(this.id, that.id)
                .append(this.sequence, that.sequence)
                .append(this.country, that.country)
                .toComparison();
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public String getCountry() {
        return country;
    }

    public Date getDate() {
        return date;
    }

    public String getId() {
        return id;
    }

    public String getSequence() {
        return sequence;
    }

    public Situation getSituation() {
        return situation;
    }

    public String getChecksum() {
        return checksum;
    }

    public enum Situation {
        NOT_USED_0,
        NORMAL,
        CONTINGENCIA,
        SIN_INTERNET,
        NOT_USED_4,
        NOT_USED_5,
        NOT_USED_6,
        NOT_USED_7,
        NOT_USED_8,
        SITUATION;

        @Override
        public String toString() {
            return String.valueOf(ordinal());
        }
    }

    public enum Field {
        Country(3),
        Date(6),
        Emitter(12),
        Sequence(20),
        Situation(1),
        Checksum(8);

        public final int length;
        public final String format;

        Field(int length) {
            this.length = length;
            this.format = "%" + length + "s";
        }
    }
}
