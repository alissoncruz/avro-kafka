/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro.com.example.kafkaavro.dto;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class person extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5542291983671242070L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"person\",\"namespace\":\"avro.com.example.kafkaavro.dto\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\",\"doc\":\"the first name of a person\"},{\"name\":\"lastName\",\"type\":\"string\",\"doc\":\"the last name of a person\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** the first name of a person */
  @Deprecated public java.lang.CharSequence firstName;
  /** the last name of a person */
  @Deprecated public java.lang.CharSequence lastName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public person() {}

  /**
   * All-args constructor.
   * @param firstName the first name of a person
   * @param lastName the last name of a person
   */
  public person(java.lang.CharSequence firstName, java.lang.CharSequence lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return lastName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstName = (java.lang.CharSequence)value$; break;
    case 1: lastName = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return the first name of a person
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * the first name of a person
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return the last name of a person
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * the last name of a person
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Creates a new person RecordBuilder.
   * @return A new person RecordBuilder
   */
  public static avro.com.example.kafkaavro.dto.person.Builder newBuilder() {
    return new avro.com.example.kafkaavro.dto.person.Builder();
  }

  /**
   * Creates a new person RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new person RecordBuilder
   */
  public static avro.com.example.kafkaavro.dto.person.Builder newBuilder(avro.com.example.kafkaavro.dto.person.Builder other) {
    return new avro.com.example.kafkaavro.dto.person.Builder(other);
  }

  /**
   * Creates a new person RecordBuilder by copying an existing person instance.
   * @param other The existing instance to copy.
   * @return A new person RecordBuilder
   */
  public static avro.com.example.kafkaavro.dto.person.Builder newBuilder(avro.com.example.kafkaavro.dto.person other) {
    return new avro.com.example.kafkaavro.dto.person.Builder(other);
  }

  /**
   * RecordBuilder for person instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<person>
    implements org.apache.avro.data.RecordBuilder<person> {

    /** the first name of a person */
    private java.lang.CharSequence firstName;
    /** the last name of a person */
    private java.lang.CharSequence lastName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.com.example.kafkaavro.dto.person.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing person instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.com.example.kafkaavro.dto.person other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'firstName' field.
      * the first name of a person
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * the first name of a person
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public avro.com.example.kafkaavro.dto.person.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * the first name of a person
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * the first name of a person
      * @return This builder.
      */
    public avro.com.example.kafkaavro.dto.person.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * the last name of a person
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * the last name of a person
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public avro.com.example.kafkaavro.dto.person.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.lastName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * the last name of a person
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastName' field.
      * the last name of a person
      * @return This builder.
      */
    public avro.com.example.kafkaavro.dto.person.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public person build() {
      try {
        person record = new person();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.lastName = fieldSetFlags()[1] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
