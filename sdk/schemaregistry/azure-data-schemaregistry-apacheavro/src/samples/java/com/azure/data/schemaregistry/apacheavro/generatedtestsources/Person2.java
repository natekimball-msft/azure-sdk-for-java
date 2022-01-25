/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.azure.data.schemaregistry.apacheavro.generatedtestsources;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class Person2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4656726510657458006L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"com.azure.data.schemaregistry.apacheavro.generatedtestsources\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"favourite_number\",\"type\":[\"int\",\"null\"]},{\"name\":\"favourite_colour\",\"type\":[\"string\",\"null\"]},{\"name\":\"favourite_pet\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Person2> ENCODER =
      new BinaryMessageEncoder<Person2>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Person2> DECODER =
      new BinaryMessageDecoder<Person2>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Person2> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Person2> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Person2> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Person2>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Person2 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Person2 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Person2 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Person2 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String name;
   private java.lang.Integer favourite_number;
   private java.lang.String favourite_colour;
   private java.lang.String favourite_pet;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Person2() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param favourite_number The new value for favourite_number
   * @param favourite_colour The new value for favourite_colour
   * @param favourite_pet The new value for favourite_pet
   */
  public Person2(java.lang.String name, java.lang.Integer favourite_number, java.lang.String favourite_colour, java.lang.String favourite_pet) {
    this.name = name;
    this.favourite_number = favourite_number;
    this.favourite_colour = favourite_colour;
    this.favourite_pet = favourite_pet;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return favourite_number;
    case 2: return favourite_colour;
    case 3: return favourite_pet;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = value$ != null ? value$.toString() : null; break;
    case 1: favourite_number = (java.lang.Integer)value$; break;
    case 2: favourite_colour = value$ != null ? value$.toString() : null; break;
    case 3: favourite_pet = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'favourite_number' field.
   * @return The value of the 'favourite_number' field.
   */
  public java.lang.Integer getFavouriteNumber() {
    return favourite_number;
  }


  /**
   * Sets the value of the 'favourite_number' field.
   * @param value the value to set.
   */
  public void setFavouriteNumber(java.lang.Integer value) {
    this.favourite_number = value;
  }

  /**
   * Gets the value of the 'favourite_colour' field.
   * @return The value of the 'favourite_colour' field.
   */
  public java.lang.String getFavouriteColour() {
    return favourite_colour;
  }


  /**
   * Sets the value of the 'favourite_colour' field.
   * @param value the value to set.
   */
  public void setFavouriteColour(java.lang.String value) {
    this.favourite_colour = value;
  }

  /**
   * Gets the value of the 'favourite_pet' field.
   * @return The value of the 'favourite_pet' field.
   */
  public java.lang.String getFavouritePet() {
    return favourite_pet;
  }


  /**
   * Sets the value of the 'favourite_pet' field.
   * @param value the value to set.
   */
  public void setFavouritePet(java.lang.String value) {
    this.favourite_pet = value;
  }

  /**
   * Creates a new Person2 RecordBuilder.
   * @return A new Person2 RecordBuilder
   */
  public static com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder newBuilder() {
    return new com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder();
  }

  /**
   * Creates a new Person2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Person2 RecordBuilder
   */
  public static com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder newBuilder(com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder other) {
    if (other == null) {
      return new com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder();
    } else {
      return new com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder(other);
    }
  }

  /**
   * Creates a new Person2 RecordBuilder by copying an existing Person2 instance.
   * @param other The existing instance to copy.
   * @return A new Person2 RecordBuilder
   */
  public static com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder newBuilder(com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2 other) {
    if (other == null) {
      return new com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder();
    } else {
      return new com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder(other);
    }
  }

  /**
   * RecordBuilder for Person2 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Person2>
    implements org.apache.avro.data.RecordBuilder<Person2> {

    private java.lang.String name;
    private java.lang.Integer favourite_number;
    private java.lang.String favourite_colour;
    private java.lang.String favourite_pet;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.favourite_number)) {
        this.favourite_number = data().deepCopy(fields()[1].schema(), other.favourite_number);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.favourite_colour)) {
        this.favourite_colour = data().deepCopy(fields()[2].schema(), other.favourite_colour);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.favourite_pet)) {
        this.favourite_pet = data().deepCopy(fields()[3].schema(), other.favourite_pet);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Person2 instance
     * @param other The existing instance to copy.
     */
    private Builder(com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2 other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.favourite_number)) {
        this.favourite_number = data().deepCopy(fields()[1].schema(), other.favourite_number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.favourite_colour)) {
        this.favourite_colour = data().deepCopy(fields()[2].schema(), other.favourite_colour);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.favourite_pet)) {
        this.favourite_pet = data().deepCopy(fields()[3].schema(), other.favourite_pet);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'favourite_number' field.
      * @return The value.
      */
    public java.lang.Integer getFavouriteNumber() {
      return favourite_number;
    }


    /**
      * Sets the value of the 'favourite_number' field.
      * @param value The value of 'favourite_number'.
      * @return This builder.
      */
    public com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder setFavouriteNumber(java.lang.Integer value) {
      validate(fields()[1], value);
      this.favourite_number = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'favourite_number' field has been set.
      * @return True if the 'favourite_number' field has been set, false otherwise.
      */
    public boolean hasFavouriteNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'favourite_number' field.
      * @return This builder.
      */
    public com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder clearFavouriteNumber() {
      favourite_number = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'favourite_colour' field.
      * @return The value.
      */
    public java.lang.String getFavouriteColour() {
      return favourite_colour;
    }


    /**
      * Sets the value of the 'favourite_colour' field.
      * @param value The value of 'favourite_colour'.
      * @return This builder.
      */
    public com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder setFavouriteColour(java.lang.String value) {
      validate(fields()[2], value);
      this.favourite_colour = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'favourite_colour' field has been set.
      * @return True if the 'favourite_colour' field has been set, false otherwise.
      */
    public boolean hasFavouriteColour() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'favourite_colour' field.
      * @return This builder.
      */
    public com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder clearFavouriteColour() {
      favourite_colour = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'favourite_pet' field.
      * @return The value.
      */
    public java.lang.String getFavouritePet() {
      return favourite_pet;
    }


    /**
      * Sets the value of the 'favourite_pet' field.
      * @param value The value of 'favourite_pet'.
      * @return This builder.
      */
    public com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder setFavouritePet(java.lang.String value) {
      validate(fields()[3], value);
      this.favourite_pet = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'favourite_pet' field has been set.
      * @return True if the 'favourite_pet' field has been set, false otherwise.
      */
    public boolean hasFavouritePet() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'favourite_pet' field.
      * @return This builder.
      */
    public com.azure.data.schemaregistry.apacheavro.generatedtestsources.Person2.Builder clearFavouritePet() {
      favourite_pet = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Person2 build() {
      try {
        Person2 record = new Person2();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.favourite_number = fieldSetFlags()[1] ? this.favourite_number : (java.lang.Integer) defaultValue(fields()[1]);
        record.favourite_colour = fieldSetFlags()[2] ? this.favourite_colour : (java.lang.String) defaultValue(fields()[2]);
        record.favourite_pet = fieldSetFlags()[3] ? this.favourite_pet : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Person2>
    WRITER$ = (org.apache.avro.io.DatumWriter<Person2>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Person2>
    READER$ = (org.apache.avro.io.DatumReader<Person2>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    if (this.favourite_number == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeInt(this.favourite_number);
    }

    if (this.favourite_colour == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.favourite_colour);
    }

    if (this.favourite_pet == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.favourite_pet);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString();

      if (in.readIndex() != 0) {
        in.readNull();
        this.favourite_number = null;
      } else {
        this.favourite_number = in.readInt();
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.favourite_colour = null;
      } else {
        this.favourite_colour = in.readString();
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.favourite_pet = null;
      } else {
        this.favourite_pet = in.readString();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString();
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.favourite_number = null;
          } else {
            this.favourite_number = in.readInt();
          }
          break;

        case 2:
          if (in.readIndex() != 0) {
            in.readNull();
            this.favourite_colour = null;
          } else {
            this.favourite_colour = in.readString();
          }
          break;

        case 3:
          if (in.readIndex() != 0) {
            in.readNull();
            this.favourite_pet = null;
          } else {
            this.favourite_pet = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










