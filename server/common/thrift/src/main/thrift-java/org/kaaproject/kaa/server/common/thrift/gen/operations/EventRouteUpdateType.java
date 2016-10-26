/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;


/**
 * Enum defines route update operation type
 */
public enum EventRouteUpdateType implements org.apache.thrift.TEnum {
  ADD(1),
  DELETE(2),
  UPDATE(3);

  private final int value;

  private EventRouteUpdateType(int value) {
    this.value = value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   *
   * @return null if the value is not found.
   */
  public static EventRouteUpdateType findByValue(int value) {
    switch (value) {
      case 1:
        return ADD;
      case 2:
        return DELETE;
      case 3:
        return UPDATE;
      default:
        return null;
    }
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }
}
