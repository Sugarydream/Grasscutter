// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DGCJOENFOJC.proto

package emu.grasscutter.net.proto;

public final class DGCJOENFOJCOuterClass {
  private DGCJOENFOJCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DGCJOENFOJCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DGCJOENFOJC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool CGNLFFJBLBH = 9;</code>
     * @return The cGNLFFJBLBH.
     */
    boolean getCGNLFFJBLBH();
  }
  /**
   * Protobuf type {@code DGCJOENFOJC}
   */
  public static final class DGCJOENFOJC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DGCJOENFOJC)
      DGCJOENFOJCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DGCJOENFOJC.newBuilder() to construct.
    private DGCJOENFOJC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DGCJOENFOJC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DGCJOENFOJC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DGCJOENFOJC(
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
            case 72: {

              cGNLFFJBLBH_ = input.readBool();
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
      return emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.internal_static_DGCJOENFOJC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.internal_static_DGCJOENFOJC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC.class, emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC.Builder.class);
    }

    public static final int CGNLFFJBLBH_FIELD_NUMBER = 9;
    private boolean cGNLFFJBLBH_;
    /**
     * <code>bool CGNLFFJBLBH = 9;</code>
     * @return The cGNLFFJBLBH.
     */
    @java.lang.Override
    public boolean getCGNLFFJBLBH() {
      return cGNLFFJBLBH_;
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
      if (cGNLFFJBLBH_ != false) {
        output.writeBool(9, cGNLFFJBLBH_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cGNLFFJBLBH_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, cGNLFFJBLBH_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC other = (emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC) obj;

      if (getCGNLFFJBLBH()
          != other.getCGNLFFJBLBH()) return false;
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
      hash = (37 * hash) + CGNLFFJBLBH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getCGNLFFJBLBH());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC prototype) {
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
     * Protobuf type {@code DGCJOENFOJC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DGCJOENFOJC)
        emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.internal_static_DGCJOENFOJC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.internal_static_DGCJOENFOJC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC.class, emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC.newBuilder()
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
        cGNLFFJBLBH_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.internal_static_DGCJOENFOJC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC build() {
        emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC buildPartial() {
        emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC result = new emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC(this);
        result.cGNLFFJBLBH_ = cGNLFFJBLBH_;
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
        if (other instanceof emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC) {
          return mergeFrom((emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC other) {
        if (other == emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC.getDefaultInstance()) return this;
        if (other.getCGNLFFJBLBH() != false) {
          setCGNLFFJBLBH(other.getCGNLFFJBLBH());
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
        emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean cGNLFFJBLBH_ ;
      /**
       * <code>bool CGNLFFJBLBH = 9;</code>
       * @return The cGNLFFJBLBH.
       */
      @java.lang.Override
      public boolean getCGNLFFJBLBH() {
        return cGNLFFJBLBH_;
      }
      /**
       * <code>bool CGNLFFJBLBH = 9;</code>
       * @param value The cGNLFFJBLBH to set.
       * @return This builder for chaining.
       */
      public Builder setCGNLFFJBLBH(boolean value) {
        
        cGNLFFJBLBH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool CGNLFFJBLBH = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCGNLFFJBLBH() {
        
        cGNLFFJBLBH_ = false;
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


      // @@protoc_insertion_point(builder_scope:DGCJOENFOJC)
    }

    // @@protoc_insertion_point(class_scope:DGCJOENFOJC)
    private static final emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC();
    }

    public static emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DGCJOENFOJC>
        PARSER = new com.google.protobuf.AbstractParser<DGCJOENFOJC>() {
      @java.lang.Override
      public DGCJOENFOJC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DGCJOENFOJC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DGCJOENFOJC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DGCJOENFOJC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DGCJOENFOJCOuterClass.DGCJOENFOJC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DGCJOENFOJC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DGCJOENFOJC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DGCJOENFOJC.proto\"\"\n\013DGCJOENFOJC\022\023\n\013CG" +
      "NLFFJBLBH\030\t \001(\010B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DGCJOENFOJC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DGCJOENFOJC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DGCJOENFOJC_descriptor,
        new java.lang.String[] { "CGNLFFJBLBH", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
