// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/router/config.proto

package com.v2ray.core.app.router;

public interface DomainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.router.Domain)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Domain matching type.
   * </pre>
   *
   * <code>.v2ray.core.app.router.Domain.Type type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Domain matching type.
   * </pre>
   *
   * <code>.v2ray.core.app.router.Domain.Type type = 1;</code>
   */
  Domain.Type getType();

  /**
   * <pre>
   * Domain value.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  String getValue();
  /**
   * <pre>
   * Domain value.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
