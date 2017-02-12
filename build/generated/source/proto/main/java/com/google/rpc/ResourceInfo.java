// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: error_details.proto

package com.google.rpc;

/**
 * <pre>
 * Describes the resource that is being accessed.
 * </pre>
 *
 * Protobuf type {@code google.rpc.ResourceInfo}
 */
public  final class ResourceInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.rpc.ResourceInfo)
    ResourceInfoOrBuilder {
  // Use ResourceInfo.newBuilder() to construct.
  private ResourceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceInfo() {
    resourceType_ = "";
    resourceName_ = "";
    owner_ = "";
    description_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ResourceInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            owner_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_ResourceInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_ResourceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.rpc.ResourceInfo.class, com.google.rpc.ResourceInfo.Builder.class);
  }

  public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceType_;
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>optional string resource_type = 1;</code>
   */
  public java.lang.String getResourceType() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>optional string resource_type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceTypeBytes() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>optional string resource_name = 2;</code>
   */
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>optional string resource_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OWNER_FIELD_NUMBER = 3;
  private volatile java.lang.Object owner_;
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>optional string owner = 3;</code>
   */
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>optional string owner = 3;</code>
   */
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      owner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getResourceTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceType_);
    }
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceName_);
    }
    if (!getOwnerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, owner_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceType_);
    }
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceName_);
    }
    if (!getOwnerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, owner_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.rpc.ResourceInfo)) {
      return super.equals(obj);
    }
    com.google.rpc.ResourceInfo other = (com.google.rpc.ResourceInfo) obj;

    boolean result = true;
    result = result && getResourceType()
        .equals(other.getResourceType());
    result = result && getResourceName()
        .equals(other.getResourceName());
    result = result && getOwner()
        .equals(other.getOwner());
    result = result && getDescription()
        .equals(other.getDescription());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + RESOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResourceType().hashCode();
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.rpc.ResourceInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.rpc.ResourceInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Describes the resource that is being accessed.
   * </pre>
   *
   * Protobuf type {@code google.rpc.ResourceInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.ResourceInfo)
      com.google.rpc.ResourceInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_ResourceInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_ResourceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.rpc.ResourceInfo.class, com.google.rpc.ResourceInfo.Builder.class);
    }

    // Construct using com.google.rpc.ResourceInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      resourceType_ = "";

      resourceName_ = "";

      owner_ = "";

      description_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_ResourceInfo_descriptor;
    }

    public com.google.rpc.ResourceInfo getDefaultInstanceForType() {
      return com.google.rpc.ResourceInfo.getDefaultInstance();
    }

    public com.google.rpc.ResourceInfo build() {
      com.google.rpc.ResourceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.rpc.ResourceInfo buildPartial() {
      com.google.rpc.ResourceInfo result = new com.google.rpc.ResourceInfo(this);
      result.resourceType_ = resourceType_;
      result.resourceName_ = resourceName_;
      result.owner_ = owner_;
      result.description_ = description_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.rpc.ResourceInfo) {
        return mergeFrom((com.google.rpc.ResourceInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.rpc.ResourceInfo other) {
      if (other == com.google.rpc.ResourceInfo.getDefaultInstance()) return this;
      if (!other.getResourceType().isEmpty()) {
        resourceType_ = other.resourceType_;
        onChanged();
      }
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.rpc.ResourceInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.rpc.ResourceInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceType_ = "";
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public java.lang.String getResourceType() {
      java.lang.Object ref = resourceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceTypeBytes() {
      java.lang.Object ref = resourceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public Builder setResourceType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public Builder clearResourceType() {
      
      resourceType_ = getDefaultInstance().getResourceType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public Builder setResourceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>optional string resource_name = 2;</code>
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>optional string resource_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>optional string resource_name = 2;</code>
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>optional string resource_name = 2;</code>
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>optional string resource_name = 2;</code>
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object owner_ = "";
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public Builder setOwner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      owner_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public Builder clearOwner() {
      
      owner_ = getDefaultInstance().getOwner();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      owner_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.rpc.ResourceInfo)
  }

  // @@protoc_insertion_point(class_scope:google.rpc.ResourceInfo)
  private static final com.google.rpc.ResourceInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.rpc.ResourceInfo();
  }

  public static com.google.rpc.ResourceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceInfo>
      PARSER = new com.google.protobuf.AbstractParser<ResourceInfo>() {
    public ResourceInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResourceInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResourceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceInfo> getParserForType() {
    return PARSER;
  }

  public com.google.rpc.ResourceInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

