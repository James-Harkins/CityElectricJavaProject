// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package com.sampleProject.Product.Proto;

public final class ProductProto {
  private ProductProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProductOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Product)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 productID = 1;</code>
     * @return The productID.
     */
    int getProductID();

    /**
     * <code>string catalog = 2;</code>
     * @return The catalog.
     */
    java.lang.String getCatalog();
    /**
     * <code>string catalog = 2;</code>
     * @return The bytes for catalog.
     */
    com.google.protobuf.ByteString
        getCatalogBytes();

    /**
     * <code>string stockcode = 3;</code>
     * @return The stockcode.
     */
    java.lang.String getStockcode();
    /**
     * <code>string stockcode = 3;</code>
     * @return The bytes for stockcode.
     */
    com.google.protobuf.ByteString
        getStockcodeBytes();

    /**
     * <code>string productDescription = 4;</code>
     * @return The productDescription.
     */
    java.lang.String getProductDescription();
    /**
     * <code>string productDescription = 4;</code>
     * @return The bytes for productDescription.
     */
    com.google.protobuf.ByteString
        getProductDescriptionBytes();
  }
  /**
   * <pre>
   **
   * Product proto object
   * </pre>
   *
   * Protobuf type {@code Product}
   */
  public static final class Product extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Product)
      ProductOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Product.newBuilder() to construct.
    private Product(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Product() {
      catalog_ = "";
      stockcode_ = "";
      productDescription_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Product();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Product(
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

              productID_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              catalog_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              stockcode_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              productDescription_ = s;
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
      return com.sampleProject.Product.Proto.ProductProto.internal_static_Product_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sampleProject.Product.Proto.ProductProto.internal_static_Product_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sampleProject.Product.Proto.ProductProto.Product.class, com.sampleProject.Product.Proto.ProductProto.Product.Builder.class);
    }

    public static final int PRODUCTID_FIELD_NUMBER = 1;
    private int productID_;
    /**
     * <code>int32 productID = 1;</code>
     * @return The productID.
     */
    @java.lang.Override
    public int getProductID() {
      return productID_;
    }

    public static final int CATALOG_FIELD_NUMBER = 2;
    private volatile java.lang.Object catalog_;
    /**
     * <code>string catalog = 2;</code>
     * @return The catalog.
     */
    @java.lang.Override
    public java.lang.String getCatalog() {
      java.lang.Object ref = catalog_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        catalog_ = s;
        return s;
      }
    }
    /**
     * <code>string catalog = 2;</code>
     * @return The bytes for catalog.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCatalogBytes() {
      java.lang.Object ref = catalog_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        catalog_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STOCKCODE_FIELD_NUMBER = 3;
    private volatile java.lang.Object stockcode_;
    /**
     * <code>string stockcode = 3;</code>
     * @return The stockcode.
     */
    @java.lang.Override
    public java.lang.String getStockcode() {
      java.lang.Object ref = stockcode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stockcode_ = s;
        return s;
      }
    }
    /**
     * <code>string stockcode = 3;</code>
     * @return The bytes for stockcode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStockcodeBytes() {
      java.lang.Object ref = stockcode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stockcode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRODUCTDESCRIPTION_FIELD_NUMBER = 4;
    private volatile java.lang.Object productDescription_;
    /**
     * <code>string productDescription = 4;</code>
     * @return The productDescription.
     */
    @java.lang.Override
    public java.lang.String getProductDescription() {
      java.lang.Object ref = productDescription_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productDescription_ = s;
        return s;
      }
    }
    /**
     * <code>string productDescription = 4;</code>
     * @return The bytes for productDescription.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProductDescriptionBytes() {
      java.lang.Object ref = productDescription_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (productID_ != 0) {
        output.writeInt32(1, productID_);
      }
      if (!getCatalogBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, catalog_);
      }
      if (!getStockcodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, stockcode_);
      }
      if (!getProductDescriptionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, productDescription_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (productID_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, productID_);
      }
      if (!getCatalogBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, catalog_);
      }
      if (!getStockcodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, stockcode_);
      }
      if (!getProductDescriptionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, productDescription_);
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
      if (!(obj instanceof com.sampleProject.Product.Proto.ProductProto.Product)) {
        return super.equals(obj);
      }
      com.sampleProject.Product.Proto.ProductProto.Product other = (com.sampleProject.Product.Proto.ProductProto.Product) obj;

      if (getProductID()
          != other.getProductID()) return false;
      if (!getCatalog()
          .equals(other.getCatalog())) return false;
      if (!getStockcode()
          .equals(other.getStockcode())) return false;
      if (!getProductDescription()
          .equals(other.getProductDescription())) return false;
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
      hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
      hash = (53 * hash) + getProductID();
      hash = (37 * hash) + CATALOG_FIELD_NUMBER;
      hash = (53 * hash) + getCatalog().hashCode();
      hash = (37 * hash) + STOCKCODE_FIELD_NUMBER;
      hash = (53 * hash) + getStockcode().hashCode();
      hash = (37 * hash) + PRODUCTDESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getProductDescription().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.sampleProject.Product.Proto.ProductProto.Product parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sampleProject.Product.Proto.ProductProto.Product parseFrom(
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
    public static Builder newBuilder(com.sampleProject.Product.Proto.ProductProto.Product prototype) {
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
     **
     * Product proto object
     * </pre>
     *
     * Protobuf type {@code Product}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Product)
        com.sampleProject.Product.Proto.ProductProto.ProductOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sampleProject.Product.Proto.ProductProto.internal_static_Product_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sampleProject.Product.Proto.ProductProto.internal_static_Product_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sampleProject.Product.Proto.ProductProto.Product.class, com.sampleProject.Product.Proto.ProductProto.Product.Builder.class);
      }

      // Construct using com.sampleProject.Product.Proto.ProductProto.Product.newBuilder()
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
        productID_ = 0;

        catalog_ = "";

        stockcode_ = "";

        productDescription_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sampleProject.Product.Proto.ProductProto.internal_static_Product_descriptor;
      }

      @java.lang.Override
      public com.sampleProject.Product.Proto.ProductProto.Product getDefaultInstanceForType() {
        return com.sampleProject.Product.Proto.ProductProto.Product.getDefaultInstance();
      }

      @java.lang.Override
      public com.sampleProject.Product.Proto.ProductProto.Product build() {
        com.sampleProject.Product.Proto.ProductProto.Product result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.sampleProject.Product.Proto.ProductProto.Product buildPartial() {
        com.sampleProject.Product.Proto.ProductProto.Product result = new com.sampleProject.Product.Proto.ProductProto.Product(this);
        result.productID_ = productID_;
        result.catalog_ = catalog_;
        result.stockcode_ = stockcode_;
        result.productDescription_ = productDescription_;
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
        if (other instanceof com.sampleProject.Product.Proto.ProductProto.Product) {
          return mergeFrom((com.sampleProject.Product.Proto.ProductProto.Product)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sampleProject.Product.Proto.ProductProto.Product other) {
        if (other == com.sampleProject.Product.Proto.ProductProto.Product.getDefaultInstance()) return this;
        if (other.getProductID() != 0) {
          setProductID(other.getProductID());
        }
        if (!other.getCatalog().isEmpty()) {
          catalog_ = other.catalog_;
          onChanged();
        }
        if (!other.getStockcode().isEmpty()) {
          stockcode_ = other.stockcode_;
          onChanged();
        }
        if (!other.getProductDescription().isEmpty()) {
          productDescription_ = other.productDescription_;
          onChanged();
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
        com.sampleProject.Product.Proto.ProductProto.Product parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.sampleProject.Product.Proto.ProductProto.Product) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int productID_ ;
      /**
       * <code>int32 productID = 1;</code>
       * @return The productID.
       */
      @java.lang.Override
      public int getProductID() {
        return productID_;
      }
      /**
       * <code>int32 productID = 1;</code>
       * @param value The productID to set.
       * @return This builder for chaining.
       */
      public Builder setProductID(int value) {
        
        productID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 productID = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductID() {
        
        productID_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object catalog_ = "";
      /**
       * <code>string catalog = 2;</code>
       * @return The catalog.
       */
      public java.lang.String getCatalog() {
        java.lang.Object ref = catalog_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          catalog_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string catalog = 2;</code>
       * @return The bytes for catalog.
       */
      public com.google.protobuf.ByteString
          getCatalogBytes() {
        java.lang.Object ref = catalog_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          catalog_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string catalog = 2;</code>
       * @param value The catalog to set.
       * @return This builder for chaining.
       */
      public Builder setCatalog(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        catalog_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string catalog = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCatalog() {
        
        catalog_ = getDefaultInstance().getCatalog();
        onChanged();
        return this;
      }
      /**
       * <code>string catalog = 2;</code>
       * @param value The bytes for catalog to set.
       * @return This builder for chaining.
       */
      public Builder setCatalogBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        catalog_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object stockcode_ = "";
      /**
       * <code>string stockcode = 3;</code>
       * @return The stockcode.
       */
      public java.lang.String getStockcode() {
        java.lang.Object ref = stockcode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          stockcode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string stockcode = 3;</code>
       * @return The bytes for stockcode.
       */
      public com.google.protobuf.ByteString
          getStockcodeBytes() {
        java.lang.Object ref = stockcode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          stockcode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string stockcode = 3;</code>
       * @param value The stockcode to set.
       * @return This builder for chaining.
       */
      public Builder setStockcode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        stockcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string stockcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStockcode() {
        
        stockcode_ = getDefaultInstance().getStockcode();
        onChanged();
        return this;
      }
      /**
       * <code>string stockcode = 3;</code>
       * @param value The bytes for stockcode to set.
       * @return This builder for chaining.
       */
      public Builder setStockcodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        stockcode_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object productDescription_ = "";
      /**
       * <code>string productDescription = 4;</code>
       * @return The productDescription.
       */
      public java.lang.String getProductDescription() {
        java.lang.Object ref = productDescription_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          productDescription_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string productDescription = 4;</code>
       * @return The bytes for productDescription.
       */
      public com.google.protobuf.ByteString
          getProductDescriptionBytes() {
        java.lang.Object ref = productDescription_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          productDescription_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string productDescription = 4;</code>
       * @param value The productDescription to set.
       * @return This builder for chaining.
       */
      public Builder setProductDescription(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        productDescription_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string productDescription = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductDescription() {
        
        productDescription_ = getDefaultInstance().getProductDescription();
        onChanged();
        return this;
      }
      /**
       * <code>string productDescription = 4;</code>
       * @param value The bytes for productDescription to set.
       * @return This builder for chaining.
       */
      public Builder setProductDescriptionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        productDescription_ = value;
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


      // @@protoc_insertion_point(builder_scope:Product)
    }

    // @@protoc_insertion_point(class_scope:Product)
    private static final com.sampleProject.Product.Proto.ProductProto.Product DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.sampleProject.Product.Proto.ProductProto.Product();
    }

    public static com.sampleProject.Product.Proto.ProductProto.Product getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Product>
        PARSER = new com.google.protobuf.AbstractParser<Product>() {
      @java.lang.Override
      public Product parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Product(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Product> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Product> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.sampleProject.Product.Proto.ProductProto.Product getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Product_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Product_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rProduct.proto\"\\\n\007Product\022\021\n\tproductID\030" +
      "\001 \001(\005\022\017\n\007catalog\030\002 \001(\t\022\021\n\tstockcode\030\003 \001(" +
      "\t\022\032\n\022productDescription\030\004 \001(\tB/\n\037com.sam" +
      "pleProject.Product.ProtoB\014ProductProtob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Product_descriptor,
        new java.lang.String[] { "ProductID", "Catalog", "Stockcode", "ProductDescription", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
