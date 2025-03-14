// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServantInfo.proto

package emu.grasscutter.net.proto;

public final class ServantInfoOuterClass {
  private ServantInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServantInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServantInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 LEIGNAKFGHF = 1;</code>
     * @return The lEIGNAKFGHF.
     */
    int getLEIGNAKFGHF();

    /**
     * <code>uint32 IMHGJAOKPNI = 2;</code>
     * @return The iMHGJAOKPNI.
     */
    int getIMHGJAOKPNI();
  }
  /**
   * <pre>
   * Name: JAOECAEBGJO
   * </pre>
   *
   * Protobuf type {@code ServantInfo}
   */
  public static final class ServantInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServantInfo)
      ServantInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServantInfo.newBuilder() to construct.
    private ServantInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServantInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServantInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServantInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              lEIGNAKFGHF_ = input.readUInt32();
              break;
            }
            case 16: {

              iMHGJAOKPNI_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ServantInfoOuterClass.internal_static_ServantInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo.class, emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo.Builder.class);
    }

    public static final int LEIGNAKFGHF_FIELD_NUMBER = 1;
    private int lEIGNAKFGHF_;
    /**
     * <code>uint32 LEIGNAKFGHF = 1;</code>
     * @return The lEIGNAKFGHF.
     */
    @java.lang.Override
    public int getLEIGNAKFGHF() {
      return lEIGNAKFGHF_;
    }

    public static final int IMHGJAOKPNI_FIELD_NUMBER = 2;
    private int iMHGJAOKPNI_;
    /**
     * <code>uint32 IMHGJAOKPNI = 2;</code>
     * @return The iMHGJAOKPNI.
     */
    @java.lang.Override
    public int getIMHGJAOKPNI() {
      return iMHGJAOKPNI_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (lEIGNAKFGHF_ != 0) {
        output.writeUInt32(1, lEIGNAKFGHF_);
      }
      if (iMHGJAOKPNI_ != 0) {
        output.writeUInt32(2, iMHGJAOKPNI_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lEIGNAKFGHF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, lEIGNAKFGHF_);
      }
      if (iMHGJAOKPNI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, iMHGJAOKPNI_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo other = (emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo) obj;

      if (getLEIGNAKFGHF()
          != other.getLEIGNAKFGHF()) return false;
      if (getIMHGJAOKPNI()
          != other.getIMHGJAOKPNI()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LEIGNAKFGHF_FIELD_NUMBER;
      hash = (53 * hash) + getLEIGNAKFGHF();
      hash = (37 * hash) + IMHGJAOKPNI_FIELD_NUMBER;
      hash = (53 * hash) + getIMHGJAOKPNI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Name: JAOECAEBGJO
     * </pre>
     *
     * Protobuf type {@code ServantInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServantInfo)
        emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ServantInfoOuterClass.internal_static_ServantInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo.class, emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        lEIGNAKFGHF_ = 0;

        iMHGJAOKPNI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo build() {
        emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo buildPartial() {
        emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo result = new emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo(this);
        result.lEIGNAKFGHF_ = lEIGNAKFGHF_;
        result.iMHGJAOKPNI_ = iMHGJAOKPNI_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo other) {
        if (other == emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo.getDefaultInstance()) return this;
        if (other.getLEIGNAKFGHF() != 0) {
          setLEIGNAKFGHF(other.getLEIGNAKFGHF());
        }
        if (other.getIMHGJAOKPNI() != 0) {
          setIMHGJAOKPNI(other.getIMHGJAOKPNI());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int lEIGNAKFGHF_ ;
      /**
       * <code>uint32 LEIGNAKFGHF = 1;</code>
       * @return The lEIGNAKFGHF.
       */
      @java.lang.Override
      public int getLEIGNAKFGHF() {
        return lEIGNAKFGHF_;
      }
      /**
       * <code>uint32 LEIGNAKFGHF = 1;</code>
       * @param value The lEIGNAKFGHF to set.
       * @return This builder for chaining.
       */
      public Builder setLEIGNAKFGHF(int value) {
        
        lEIGNAKFGHF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LEIGNAKFGHF = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLEIGNAKFGHF() {
        
        lEIGNAKFGHF_ = 0;
        onChanged();
        return this;
      }

      private int iMHGJAOKPNI_ ;
      /**
       * <code>uint32 IMHGJAOKPNI = 2;</code>
       * @return The iMHGJAOKPNI.
       */
      @java.lang.Override
      public int getIMHGJAOKPNI() {
        return iMHGJAOKPNI_;
      }
      /**
       * <code>uint32 IMHGJAOKPNI = 2;</code>
       * @param value The iMHGJAOKPNI to set.
       * @return This builder for chaining.
       */
      public Builder setIMHGJAOKPNI(int value) {
        
        iMHGJAOKPNI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IMHGJAOKPNI = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIMHGJAOKPNI() {
        
        iMHGJAOKPNI_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ServantInfo)
    }

    // @@protoc_insertion_point(class_scope:ServantInfo)
    private static final emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo();
    }

    public static emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServantInfo>
        PARSER = new com.google.protobuf.AbstractParser<ServantInfo>() {
      @java.lang.Override
      public ServantInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServantInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServantInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServantInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ServantInfoOuterClass.ServantInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServantInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServantInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ServantInfo.proto\"7\n\013ServantInfo\022\023\n\013LE" +
      "IGNAKFGHF\030\001 \001(\r\022\023\n\013IMHGJAOKPNI\030\002 \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServantInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServantInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServantInfo_descriptor,
        new java.lang.String[] { "LEIGNAKFGHF", "IMHGJAOKPNI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
