/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.mokey.acupple.dashcam.common.models.thrift;


import org.apache.thrift.TEnum;

public enum ResultCode implements org.apache.thrift.TEnum {
  SUCCESS(0),
  FAILURE(1),
  TRY_LATER(2);

  private final int value;

  private ResultCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ResultCode findByValue(int value) { 
    switch (value) {
      case 0:
        return SUCCESS;
      case 1:
        return FAILURE;
      case 2:
        return TRY_LATER;
      default:
        return null;
    }
  }
}
