/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.flurry.avroserver.protocol.v1;  
@SuppressWarnings("all")
public class AdResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AdResponse\",\"namespace\":\"com.flurry.avroserver.protocol.v1\",\"fields\":[{\"name\":\"ads\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Ad\",\"fields\":[{\"name\":\"adSpace\",\"type\":\"string\"},{\"name\":\"adName\",\"type\":\"string\"}]}}},{\"name\":\"errors\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"default\":[]}]}");
  @Deprecated public java.util.List<com.flurry.avroserver.protocol.v1.Ad> ads;
  @Deprecated public java.util.List<java.lang.CharSequence> errors;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ads;
    case 1: return errors;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ads = (java.util.List<com.flurry.avroserver.protocol.v1.Ad>)value$; break;
    case 1: errors = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ads' field.
   */
  public java.util.List<com.flurry.avroserver.protocol.v1.Ad> getAds() {
    return ads;
  }

  /**
   * Sets the value of the 'ads' field.
   * @param value the value to set.
   */
  public void setAds(java.util.List<com.flurry.avroserver.protocol.v1.Ad> value) {
    this.ads = value;
  }

  /**
   * Gets the value of the 'errors' field.
   */
  public java.util.List<java.lang.CharSequence> getErrors() {
    return errors;
  }

  /**
   * Sets the value of the 'errors' field.
   * @param value the value to set.
   */
  public void setErrors(java.util.List<java.lang.CharSequence> value) {
    this.errors = value;
  }

  /** Creates a new AdResponse RecordBuilder */
  public static com.flurry.avroserver.protocol.v1.AdResponse.Builder newBuilder() {
    return new com.flurry.avroserver.protocol.v1.AdResponse.Builder();
  }
  
  /** Creates a new AdResponse RecordBuilder by copying an existing Builder */
  public static com.flurry.avroserver.protocol.v1.AdResponse.Builder newBuilder(com.flurry.avroserver.protocol.v1.AdResponse.Builder other) {
    return new com.flurry.avroserver.protocol.v1.AdResponse.Builder(other);
  }
  
  /** Creates a new AdResponse RecordBuilder by copying an existing AdResponse instance */
  public static com.flurry.avroserver.protocol.v1.AdResponse.Builder newBuilder(com.flurry.avroserver.protocol.v1.AdResponse other) {
    return new com.flurry.avroserver.protocol.v1.AdResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for AdResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AdResponse>
    implements org.apache.avro.data.RecordBuilder<AdResponse> {

    private java.util.List<com.flurry.avroserver.protocol.v1.Ad> ads;
    private java.util.List<java.lang.CharSequence> errors;

    /** Creates a new Builder */
    private Builder() {
      super(com.flurry.avroserver.protocol.v1.AdResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.flurry.avroserver.protocol.v1.AdResponse.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing AdResponse instance */
    private Builder(com.flurry.avroserver.protocol.v1.AdResponse other) {
            super(com.flurry.avroserver.protocol.v1.AdResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.ads)) {
        this.ads = (java.util.List<com.flurry.avroserver.protocol.v1.Ad>) data().deepCopy(fields()[0].schema(), other.ads);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.errors)) {
        this.errors = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[1].schema(), other.errors);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'ads' field */
    public java.util.List<com.flurry.avroserver.protocol.v1.Ad> getAds() {
      return ads;
    }
    
    /** Sets the value of the 'ads' field */
    public com.flurry.avroserver.protocol.v1.AdResponse.Builder setAds(java.util.List<com.flurry.avroserver.protocol.v1.Ad> value) {
      validate(fields()[0], value);
      this.ads = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'ads' field has been set */
    public boolean hasAds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'ads' field */
    public com.flurry.avroserver.protocol.v1.AdResponse.Builder clearAds() {
      ads = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'errors' field */
    public java.util.List<java.lang.CharSequence> getErrors() {
      return errors;
    }
    
    /** Sets the value of the 'errors' field */
    public com.flurry.avroserver.protocol.v1.AdResponse.Builder setErrors(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.errors = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'errors' field has been set */
    public boolean hasErrors() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'errors' field */
    public com.flurry.avroserver.protocol.v1.AdResponse.Builder clearErrors() {
      errors = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public AdResponse build() {
      try {
        AdResponse record = new AdResponse();
        record.ads = fieldSetFlags()[0] ? this.ads : (java.util.List<com.flurry.avroserver.protocol.v1.Ad>) defaultValue(fields()[0]);
        record.errors = fieldSetFlags()[1] ? this.errors : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
