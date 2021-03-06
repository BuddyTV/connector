/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.observertc.webrtc.schemas.reports;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Client media device details. */
@org.apache.avro.specific.AvroGenerated
public class MediaDevice extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3042588622518683952L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MediaDevice\",\"namespace\":\"org.observertc.webrtc.schemas.reports\",\"doc\":\"Client media device details.\",\"fields\":[{\"name\":\"mediaUnitId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"peerConnectionUUID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"callName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"browserId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"groupId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"kind\",\"type\":{\"type\":\"enum\",\"name\":\"MediaDeviceKind\",\"doc\":\"Media device kind\",\"symbols\":[\"VIDEO_INPUT\",\"AUDIO_INPUT\",\"AUDIO_OUTPUT\",\"UNKNOWN\",\"NULL\"]},\"default\":\"unknown\"},{\"name\":\"label\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MediaDevice> ENCODER =
      new BinaryMessageEncoder<MediaDevice>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MediaDevice> DECODER =
      new BinaryMessageDecoder<MediaDevice>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MediaDevice> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MediaDevice> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MediaDevice> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MediaDevice>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MediaDevice to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MediaDevice from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MediaDevice instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MediaDevice fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String mediaUnitId;
   private java.lang.String peerConnectionUUID;
   private java.lang.String callName;
   private java.lang.String userId;
   private java.lang.String browserId;
   private java.lang.String deviceId;
   private java.lang.String groupId;
   private org.observertc.webrtc.schemas.reports.MediaDeviceKind kind;
   private java.lang.String label;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MediaDevice() {}

  /**
   * All-args constructor.
   * @param mediaUnitId The new value for mediaUnitId
   * @param peerConnectionUUID The new value for peerConnectionUUID
   * @param callName The new value for callName
   * @param userId The new value for userId
   * @param browserId The new value for browserId
   * @param deviceId The new value for deviceId
   * @param groupId The new value for groupId
   * @param kind The new value for kind
   * @param label The new value for label
   */
  public MediaDevice(java.lang.String mediaUnitId, java.lang.String peerConnectionUUID, java.lang.String callName, java.lang.String userId, java.lang.String browserId, java.lang.String deviceId, java.lang.String groupId, org.observertc.webrtc.schemas.reports.MediaDeviceKind kind, java.lang.String label) {
    this.mediaUnitId = mediaUnitId;
    this.peerConnectionUUID = peerConnectionUUID;
    this.callName = callName;
    this.userId = userId;
    this.browserId = browserId;
    this.deviceId = deviceId;
    this.groupId = groupId;
    this.kind = kind;
    this.label = label;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return mediaUnitId;
    case 1: return peerConnectionUUID;
    case 2: return callName;
    case 3: return userId;
    case 4: return browserId;
    case 5: return deviceId;
    case 6: return groupId;
    case 7: return kind;
    case 8: return label;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: mediaUnitId = value$ != null ? value$.toString() : null; break;
    case 1: peerConnectionUUID = value$ != null ? value$.toString() : null; break;
    case 2: callName = value$ != null ? value$.toString() : null; break;
    case 3: userId = value$ != null ? value$.toString() : null; break;
    case 4: browserId = value$ != null ? value$.toString() : null; break;
    case 5: deviceId = value$ != null ? value$.toString() : null; break;
    case 6: groupId = value$ != null ? value$.toString() : null; break;
    case 7: kind = (org.observertc.webrtc.schemas.reports.MediaDeviceKind)value$; break;
    case 8: label = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'mediaUnitId' field.
   * @return The value of the 'mediaUnitId' field.
   */
  public java.lang.String getMediaUnitId() {
    return mediaUnitId;
  }



  /**
   * Gets the value of the 'peerConnectionUUID' field.
   * @return The value of the 'peerConnectionUUID' field.
   */
  public java.lang.String getPeerConnectionUUID() {
    return peerConnectionUUID;
  }



  /**
   * Gets the value of the 'callName' field.
   * @return The value of the 'callName' field.
   */
  public java.lang.String getCallName() {
    return callName;
  }



  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.String getUserId() {
    return userId;
  }



  /**
   * Gets the value of the 'browserId' field.
   * @return The value of the 'browserId' field.
   */
  public java.lang.String getBrowserId() {
    return browserId;
  }



  /**
   * Gets the value of the 'deviceId' field.
   * @return The value of the 'deviceId' field.
   */
  public java.lang.String getDeviceId() {
    return deviceId;
  }



  /**
   * Gets the value of the 'groupId' field.
   * @return The value of the 'groupId' field.
   */
  public java.lang.String getGroupId() {
    return groupId;
  }



  /**
   * Gets the value of the 'kind' field.
   * @return The value of the 'kind' field.
   */
  public org.observertc.webrtc.schemas.reports.MediaDeviceKind getKind() {
    return kind;
  }



  /**
   * Gets the value of the 'label' field.
   * @return The value of the 'label' field.
   */
  public java.lang.String getLabel() {
    return label;
  }



  /**
   * Creates a new MediaDevice RecordBuilder.
   * @return A new MediaDevice RecordBuilder
   */
  public static org.observertc.webrtc.schemas.reports.MediaDevice.Builder newBuilder() {
    return new org.observertc.webrtc.schemas.reports.MediaDevice.Builder();
  }

  /**
   * Creates a new MediaDevice RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MediaDevice RecordBuilder
   */
  public static org.observertc.webrtc.schemas.reports.MediaDevice.Builder newBuilder(org.observertc.webrtc.schemas.reports.MediaDevice.Builder other) {
    if (other == null) {
      return new org.observertc.webrtc.schemas.reports.MediaDevice.Builder();
    } else {
      return new org.observertc.webrtc.schemas.reports.MediaDevice.Builder(other);
    }
  }

  /**
   * Creates a new MediaDevice RecordBuilder by copying an existing MediaDevice instance.
   * @param other The existing instance to copy.
   * @return A new MediaDevice RecordBuilder
   */
  public static org.observertc.webrtc.schemas.reports.MediaDevice.Builder newBuilder(org.observertc.webrtc.schemas.reports.MediaDevice other) {
    if (other == null) {
      return new org.observertc.webrtc.schemas.reports.MediaDevice.Builder();
    } else {
      return new org.observertc.webrtc.schemas.reports.MediaDevice.Builder(other);
    }
  }

  /**
   * RecordBuilder for MediaDevice instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MediaDevice>
    implements org.apache.avro.data.RecordBuilder<MediaDevice> {

    private java.lang.String mediaUnitId;
    private java.lang.String peerConnectionUUID;
    private java.lang.String callName;
    private java.lang.String userId;
    private java.lang.String browserId;
    private java.lang.String deviceId;
    private java.lang.String groupId;
    private org.observertc.webrtc.schemas.reports.MediaDeviceKind kind;
    private java.lang.String label;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.observertc.webrtc.schemas.reports.MediaDevice.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.mediaUnitId)) {
        this.mediaUnitId = data().deepCopy(fields()[0].schema(), other.mediaUnitId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.peerConnectionUUID)) {
        this.peerConnectionUUID = data().deepCopy(fields()[1].schema(), other.peerConnectionUUID);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.callName)) {
        this.callName = data().deepCopy(fields()[2].schema(), other.callName);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.userId)) {
        this.userId = data().deepCopy(fields()[3].schema(), other.userId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.browserId)) {
        this.browserId = data().deepCopy(fields()[4].schema(), other.browserId);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.deviceId)) {
        this.deviceId = data().deepCopy(fields()[5].schema(), other.deviceId);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.groupId)) {
        this.groupId = data().deepCopy(fields()[6].schema(), other.groupId);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.kind)) {
        this.kind = data().deepCopy(fields()[7].schema(), other.kind);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.label)) {
        this.label = data().deepCopy(fields()[8].schema(), other.label);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing MediaDevice instance
     * @param other The existing instance to copy.
     */
    private Builder(org.observertc.webrtc.schemas.reports.MediaDevice other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.mediaUnitId)) {
        this.mediaUnitId = data().deepCopy(fields()[0].schema(), other.mediaUnitId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.peerConnectionUUID)) {
        this.peerConnectionUUID = data().deepCopy(fields()[1].schema(), other.peerConnectionUUID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.callName)) {
        this.callName = data().deepCopy(fields()[2].schema(), other.callName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.userId)) {
        this.userId = data().deepCopy(fields()[3].schema(), other.userId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.browserId)) {
        this.browserId = data().deepCopy(fields()[4].schema(), other.browserId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.deviceId)) {
        this.deviceId = data().deepCopy(fields()[5].schema(), other.deviceId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.groupId)) {
        this.groupId = data().deepCopy(fields()[6].schema(), other.groupId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.kind)) {
        this.kind = data().deepCopy(fields()[7].schema(), other.kind);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.label)) {
        this.label = data().deepCopy(fields()[8].schema(), other.label);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'mediaUnitId' field.
      * @return The value.
      */
    public java.lang.String getMediaUnitId() {
      return mediaUnitId;
    }


    /**
      * Sets the value of the 'mediaUnitId' field.
      * @param value The value of 'mediaUnitId'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder setMediaUnitId(java.lang.String value) {
      validate(fields()[0], value);
      this.mediaUnitId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'mediaUnitId' field has been set.
      * @return True if the 'mediaUnitId' field has been set, false otherwise.
      */
    public boolean hasMediaUnitId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'mediaUnitId' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder clearMediaUnitId() {
      mediaUnitId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'peerConnectionUUID' field.
      * @return The value.
      */
    public java.lang.String getPeerConnectionUUID() {
      return peerConnectionUUID;
    }


    /**
      * Sets the value of the 'peerConnectionUUID' field.
      * @param value The value of 'peerConnectionUUID'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder setPeerConnectionUUID(java.lang.String value) {
      validate(fields()[1], value);
      this.peerConnectionUUID = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'peerConnectionUUID' field has been set.
      * @return True if the 'peerConnectionUUID' field has been set, false otherwise.
      */
    public boolean hasPeerConnectionUUID() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'peerConnectionUUID' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder clearPeerConnectionUUID() {
      peerConnectionUUID = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'callName' field.
      * @return The value.
      */
    public java.lang.String getCallName() {
      return callName;
    }


    /**
      * Sets the value of the 'callName' field.
      * @param value The value of 'callName'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder setCallName(java.lang.String value) {
      validate(fields()[2], value);
      this.callName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'callName' field has been set.
      * @return True if the 'callName' field has been set, false otherwise.
      */
    public boolean hasCallName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'callName' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder clearCallName() {
      callName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.String getUserId() {
      return userId;
    }


    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder setUserId(java.lang.String value) {
      validate(fields()[3], value);
      this.userId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'browserId' field.
      * @return The value.
      */
    public java.lang.String getBrowserId() {
      return browserId;
    }


    /**
      * Sets the value of the 'browserId' field.
      * @param value The value of 'browserId'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder setBrowserId(java.lang.String value) {
      validate(fields()[4], value);
      this.browserId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'browserId' field has been set.
      * @return True if the 'browserId' field has been set, false otherwise.
      */
    public boolean hasBrowserId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'browserId' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder clearBrowserId() {
      browserId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'deviceId' field.
      * @return The value.
      */
    public java.lang.String getDeviceId() {
      return deviceId;
    }


    /**
      * Sets the value of the 'deviceId' field.
      * @param value The value of 'deviceId'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder setDeviceId(java.lang.String value) {
      validate(fields()[5], value);
      this.deviceId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'deviceId' field has been set.
      * @return True if the 'deviceId' field has been set, false otherwise.
      */
    public boolean hasDeviceId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'deviceId' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder clearDeviceId() {
      deviceId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'groupId' field.
      * @return The value.
      */
    public java.lang.String getGroupId() {
      return groupId;
    }


    /**
      * Sets the value of the 'groupId' field.
      * @param value The value of 'groupId'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder setGroupId(java.lang.String value) {
      validate(fields()[6], value);
      this.groupId = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'groupId' field has been set.
      * @return True if the 'groupId' field has been set, false otherwise.
      */
    public boolean hasGroupId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'groupId' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder clearGroupId() {
      groupId = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'kind' field.
      * @return The value.
      */
    public org.observertc.webrtc.schemas.reports.MediaDeviceKind getKind() {
      return kind;
    }


    /**
      * Sets the value of the 'kind' field.
      * @param value The value of 'kind'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder setKind(org.observertc.webrtc.schemas.reports.MediaDeviceKind value) {
      validate(fields()[7], value);
      this.kind = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'kind' field has been set.
      * @return True if the 'kind' field has been set, false otherwise.
      */
    public boolean hasKind() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'kind' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder clearKind() {
      kind = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'label' field.
      * @return The value.
      */
    public java.lang.String getLabel() {
      return label;
    }


    /**
      * Sets the value of the 'label' field.
      * @param value The value of 'label'.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder setLabel(java.lang.String value) {
      validate(fields()[8], value);
      this.label = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'label' field has been set.
      * @return True if the 'label' field has been set, false otherwise.
      */
    public boolean hasLabel() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'label' field.
      * @return This builder.
      */
    public org.observertc.webrtc.schemas.reports.MediaDevice.Builder clearLabel() {
      label = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MediaDevice build() {
      try {
        MediaDevice record = new MediaDevice();
        record.mediaUnitId = fieldSetFlags()[0] ? this.mediaUnitId : (java.lang.String) defaultValue(fields()[0]);
        record.peerConnectionUUID = fieldSetFlags()[1] ? this.peerConnectionUUID : (java.lang.String) defaultValue(fields()[1]);
        record.callName = fieldSetFlags()[2] ? this.callName : (java.lang.String) defaultValue(fields()[2]);
        record.userId = fieldSetFlags()[3] ? this.userId : (java.lang.String) defaultValue(fields()[3]);
        record.browserId = fieldSetFlags()[4] ? this.browserId : (java.lang.String) defaultValue(fields()[4]);
        record.deviceId = fieldSetFlags()[5] ? this.deviceId : (java.lang.String) defaultValue(fields()[5]);
        record.groupId = fieldSetFlags()[6] ? this.groupId : (java.lang.String) defaultValue(fields()[6]);
        record.kind = fieldSetFlags()[7] ? this.kind : (org.observertc.webrtc.schemas.reports.MediaDeviceKind) defaultValue(fields()[7]);
        record.label = fieldSetFlags()[8] ? this.label : (java.lang.String) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MediaDevice>
    WRITER$ = (org.apache.avro.io.DatumWriter<MediaDevice>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MediaDevice>
    READER$ = (org.apache.avro.io.DatumReader<MediaDevice>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.mediaUnitId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.mediaUnitId);
    }

    out.writeString(this.peerConnectionUUID);

    if (this.callName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.callName);
    }

    if (this.userId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.userId);
    }

    if (this.browserId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.browserId);
    }

    out.writeString(this.deviceId);

    if (this.groupId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.groupId);
    }

    out.writeEnum(this.kind.ordinal());

    if (this.label == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.label);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.mediaUnitId = null;
      } else {
        this.mediaUnitId = in.readString();
      }

      this.peerConnectionUUID = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.callName = null;
      } else {
        this.callName = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.userId = null;
      } else {
        this.userId = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.browserId = null;
      } else {
        this.browserId = in.readString();
      }

      this.deviceId = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.groupId = null;
      } else {
        this.groupId = in.readString();
      }

      this.kind = org.observertc.webrtc.schemas.reports.MediaDeviceKind.values()[in.readEnum()];

      if (in.readIndex() != 1) {
        in.readNull();
        this.label = null;
      } else {
        this.label = in.readString();
      }

    } else {
      for (int i = 0; i < 9; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.mediaUnitId = null;
          } else {
            this.mediaUnitId = in.readString();
          }
          break;

        case 1:
          this.peerConnectionUUID = in.readString();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.callName = null;
          } else {
            this.callName = in.readString();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.userId = null;
          } else {
            this.userId = in.readString();
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.browserId = null;
          } else {
            this.browserId = in.readString();
          }
          break;

        case 5:
          this.deviceId = in.readString();
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.groupId = null;
          } else {
            this.groupId = in.readString();
          }
          break;

        case 7:
          this.kind = org.observertc.webrtc.schemas.reports.MediaDeviceKind.values()[in.readEnum()];
          break;

        case 8:
          if (in.readIndex() != 1) {
            in.readNull();
            this.label = null;
          } else {
            this.label = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










