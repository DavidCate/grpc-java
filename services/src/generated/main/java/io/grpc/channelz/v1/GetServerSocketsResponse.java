// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

/**
 * Protobuf type {@code grpc.channelz.v1.GetServerSocketsResponse}
 */
public  final class GetServerSocketsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.channelz.v1.GetServerSocketsResponse)
    GetServerSocketsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetServerSocketsResponse.newBuilder() to construct.
  private GetServerSocketsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetServerSocketsResponse() {
    socketRef_ = java.util.Collections.emptyList();
    end_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetServerSocketsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              socketRef_ = new java.util.ArrayList<io.grpc.channelz.v1.SocketRef>();
              mutable_bitField0_ |= 0x00000001;
            }
            socketRef_.add(
                input.readMessage(io.grpc.channelz.v1.SocketRef.parser(), extensionRegistry));
            break;
          }
          case 16: {

            end_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        socketRef_ = java.util.Collections.unmodifiableList(socketRef_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetServerSocketsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetServerSocketsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.channelz.v1.GetServerSocketsResponse.class, io.grpc.channelz.v1.GetServerSocketsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SOCKET_REF_FIELD_NUMBER = 1;
  private java.util.List<io.grpc.channelz.v1.SocketRef> socketRef_;
  /**
   * <pre>
   * list of socket refs that the connection detail service knows about.  Sorted in
   * ascending socket_id order.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
   */
  public java.util.List<io.grpc.channelz.v1.SocketRef> getSocketRefList() {
    return socketRef_;
  }
  /**
   * <pre>
   * list of socket refs that the connection detail service knows about.  Sorted in
   * ascending socket_id order.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
   */
  public java.util.List<? extends io.grpc.channelz.v1.SocketRefOrBuilder> 
      getSocketRefOrBuilderList() {
    return socketRef_;
  }
  /**
   * <pre>
   * list of socket refs that the connection detail service knows about.  Sorted in
   * ascending socket_id order.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
   */
  public int getSocketRefCount() {
    return socketRef_.size();
  }
  /**
   * <pre>
   * list of socket refs that the connection detail service knows about.  Sorted in
   * ascending socket_id order.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
   */
  public io.grpc.channelz.v1.SocketRef getSocketRef(int index) {
    return socketRef_.get(index);
  }
  /**
   * <pre>
   * list of socket refs that the connection detail service knows about.  Sorted in
   * ascending socket_id order.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
   */
  public io.grpc.channelz.v1.SocketRefOrBuilder getSocketRefOrBuilder(
      int index) {
    return socketRef_.get(index);
  }

  public static final int END_FIELD_NUMBER = 2;
  private boolean end_;
  /**
   * <pre>
   * If set, indicates that the list of sockets is the final list.  Requesting
   * more sockets will only return more if they are created after this RPC
   * completes.
   * </pre>
   *
   * <code>bool end = 2;</code>
   */
  public boolean getEnd() {
    return end_;
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
    for (int i = 0; i < socketRef_.size(); i++) {
      output.writeMessage(1, socketRef_.get(i));
    }
    if (end_ != false) {
      output.writeBool(2, end_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < socketRef_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, socketRef_.get(i));
    }
    if (end_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, end_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.channelz.v1.GetServerSocketsResponse)) {
      return super.equals(obj);
    }
    io.grpc.channelz.v1.GetServerSocketsResponse other = (io.grpc.channelz.v1.GetServerSocketsResponse) obj;

    boolean result = true;
    result = result && getSocketRefList()
        .equals(other.getSocketRefList());
    result = result && (getEnd()
        == other.getEnd());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSocketRefCount() > 0) {
      hash = (37 * hash) + SOCKET_REF_FIELD_NUMBER;
      hash = (53 * hash) + getSocketRefList().hashCode();
    }
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.channelz.v1.GetServerSocketsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.channelz.v1.GetServerSocketsResponse parseFrom(
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
  public static Builder newBuilder(io.grpc.channelz.v1.GetServerSocketsResponse prototype) {
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
   * Protobuf type {@code grpc.channelz.v1.GetServerSocketsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.channelz.v1.GetServerSocketsResponse)
      io.grpc.channelz.v1.GetServerSocketsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetServerSocketsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetServerSocketsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.channelz.v1.GetServerSocketsResponse.class, io.grpc.channelz.v1.GetServerSocketsResponse.Builder.class);
    }

    // Construct using io.grpc.channelz.v1.GetServerSocketsResponse.newBuilder()
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
        getSocketRefFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (socketRefBuilder_ == null) {
        socketRef_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        socketRefBuilder_.clear();
      }
      end_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.channelz.v1.ChannelzProto.internal_static_grpc_channelz_v1_GetServerSocketsResponse_descriptor;
    }

    public io.grpc.channelz.v1.GetServerSocketsResponse getDefaultInstanceForType() {
      return io.grpc.channelz.v1.GetServerSocketsResponse.getDefaultInstance();
    }

    public io.grpc.channelz.v1.GetServerSocketsResponse build() {
      io.grpc.channelz.v1.GetServerSocketsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.channelz.v1.GetServerSocketsResponse buildPartial() {
      io.grpc.channelz.v1.GetServerSocketsResponse result = new io.grpc.channelz.v1.GetServerSocketsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (socketRefBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          socketRef_ = java.util.Collections.unmodifiableList(socketRef_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.socketRef_ = socketRef_;
      } else {
        result.socketRef_ = socketRefBuilder_.build();
      }
      result.end_ = end_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.channelz.v1.GetServerSocketsResponse) {
        return mergeFrom((io.grpc.channelz.v1.GetServerSocketsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.channelz.v1.GetServerSocketsResponse other) {
      if (other == io.grpc.channelz.v1.GetServerSocketsResponse.getDefaultInstance()) return this;
      if (socketRefBuilder_ == null) {
        if (!other.socketRef_.isEmpty()) {
          if (socketRef_.isEmpty()) {
            socketRef_ = other.socketRef_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSocketRefIsMutable();
            socketRef_.addAll(other.socketRef_);
          }
          onChanged();
        }
      } else {
        if (!other.socketRef_.isEmpty()) {
          if (socketRefBuilder_.isEmpty()) {
            socketRefBuilder_.dispose();
            socketRefBuilder_ = null;
            socketRef_ = other.socketRef_;
            bitField0_ = (bitField0_ & ~0x00000001);
            socketRefBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSocketRefFieldBuilder() : null;
          } else {
            socketRefBuilder_.addAllMessages(other.socketRef_);
          }
        }
      }
      if (other.getEnd() != false) {
        setEnd(other.getEnd());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.grpc.channelz.v1.GetServerSocketsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.channelz.v1.GetServerSocketsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grpc.channelz.v1.SocketRef> socketRef_ =
      java.util.Collections.emptyList();
    private void ensureSocketRefIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        socketRef_ = new java.util.ArrayList<io.grpc.channelz.v1.SocketRef>(socketRef_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.channelz.v1.SocketRef, io.grpc.channelz.v1.SocketRef.Builder, io.grpc.channelz.v1.SocketRefOrBuilder> socketRefBuilder_;

    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public java.util.List<io.grpc.channelz.v1.SocketRef> getSocketRefList() {
      if (socketRefBuilder_ == null) {
        return java.util.Collections.unmodifiableList(socketRef_);
      } else {
        return socketRefBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public int getSocketRefCount() {
      if (socketRefBuilder_ == null) {
        return socketRef_.size();
      } else {
        return socketRefBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public io.grpc.channelz.v1.SocketRef getSocketRef(int index) {
      if (socketRefBuilder_ == null) {
        return socketRef_.get(index);
      } else {
        return socketRefBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public Builder setSocketRef(
        int index, io.grpc.channelz.v1.SocketRef value) {
      if (socketRefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSocketRefIsMutable();
        socketRef_.set(index, value);
        onChanged();
      } else {
        socketRefBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public Builder setSocketRef(
        int index, io.grpc.channelz.v1.SocketRef.Builder builderForValue) {
      if (socketRefBuilder_ == null) {
        ensureSocketRefIsMutable();
        socketRef_.set(index, builderForValue.build());
        onChanged();
      } else {
        socketRefBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public Builder addSocketRef(io.grpc.channelz.v1.SocketRef value) {
      if (socketRefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSocketRefIsMutable();
        socketRef_.add(value);
        onChanged();
      } else {
        socketRefBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public Builder addSocketRef(
        int index, io.grpc.channelz.v1.SocketRef value) {
      if (socketRefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSocketRefIsMutable();
        socketRef_.add(index, value);
        onChanged();
      } else {
        socketRefBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public Builder addSocketRef(
        io.grpc.channelz.v1.SocketRef.Builder builderForValue) {
      if (socketRefBuilder_ == null) {
        ensureSocketRefIsMutable();
        socketRef_.add(builderForValue.build());
        onChanged();
      } else {
        socketRefBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public Builder addSocketRef(
        int index, io.grpc.channelz.v1.SocketRef.Builder builderForValue) {
      if (socketRefBuilder_ == null) {
        ensureSocketRefIsMutable();
        socketRef_.add(index, builderForValue.build());
        onChanged();
      } else {
        socketRefBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public Builder addAllSocketRef(
        java.lang.Iterable<? extends io.grpc.channelz.v1.SocketRef> values) {
      if (socketRefBuilder_ == null) {
        ensureSocketRefIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, socketRef_);
        onChanged();
      } else {
        socketRefBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public Builder clearSocketRef() {
      if (socketRefBuilder_ == null) {
        socketRef_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        socketRefBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public Builder removeSocketRef(int index) {
      if (socketRefBuilder_ == null) {
        ensureSocketRefIsMutable();
        socketRef_.remove(index);
        onChanged();
      } else {
        socketRefBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public io.grpc.channelz.v1.SocketRef.Builder getSocketRefBuilder(
        int index) {
      return getSocketRefFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public io.grpc.channelz.v1.SocketRefOrBuilder getSocketRefOrBuilder(
        int index) {
      if (socketRefBuilder_ == null) {
        return socketRef_.get(index);  } else {
        return socketRefBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public java.util.List<? extends io.grpc.channelz.v1.SocketRefOrBuilder> 
         getSocketRefOrBuilderList() {
      if (socketRefBuilder_ != null) {
        return socketRefBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(socketRef_);
      }
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public io.grpc.channelz.v1.SocketRef.Builder addSocketRefBuilder() {
      return getSocketRefFieldBuilder().addBuilder(
          io.grpc.channelz.v1.SocketRef.getDefaultInstance());
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public io.grpc.channelz.v1.SocketRef.Builder addSocketRefBuilder(
        int index) {
      return getSocketRefFieldBuilder().addBuilder(
          index, io.grpc.channelz.v1.SocketRef.getDefaultInstance());
    }
    /**
     * <pre>
     * list of socket refs that the connection detail service knows about.  Sorted in
     * ascending socket_id order.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
     */
    public java.util.List<io.grpc.channelz.v1.SocketRef.Builder> 
         getSocketRefBuilderList() {
      return getSocketRefFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.channelz.v1.SocketRef, io.grpc.channelz.v1.SocketRef.Builder, io.grpc.channelz.v1.SocketRefOrBuilder> 
        getSocketRefFieldBuilder() {
      if (socketRefBuilder_ == null) {
        socketRefBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.channelz.v1.SocketRef, io.grpc.channelz.v1.SocketRef.Builder, io.grpc.channelz.v1.SocketRefOrBuilder>(
                socketRef_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        socketRef_ = null;
      }
      return socketRefBuilder_;
    }

    private boolean end_ ;
    /**
     * <pre>
     * If set, indicates that the list of sockets is the final list.  Requesting
     * more sockets will only return more if they are created after this RPC
     * completes.
     * </pre>
     *
     * <code>bool end = 2;</code>
     */
    public boolean getEnd() {
      return end_;
    }
    /**
     * <pre>
     * If set, indicates that the list of sockets is the final list.  Requesting
     * more sockets will only return more if they are created after this RPC
     * completes.
     * </pre>
     *
     * <code>bool end = 2;</code>
     */
    public Builder setEnd(boolean value) {
      
      end_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, indicates that the list of sockets is the final list.  Requesting
     * more sockets will only return more if they are created after this RPC
     * completes.
     * </pre>
     *
     * <code>bool end = 2;</code>
     */
    public Builder clearEnd() {
      
      end_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.channelz.v1.GetServerSocketsResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.channelz.v1.GetServerSocketsResponse)
  private static final io.grpc.channelz.v1.GetServerSocketsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.channelz.v1.GetServerSocketsResponse();
  }

  public static io.grpc.channelz.v1.GetServerSocketsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetServerSocketsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetServerSocketsResponse>() {
    public GetServerSocketsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetServerSocketsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetServerSocketsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetServerSocketsResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.channelz.v1.GetServerSocketsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

