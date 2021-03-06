/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class WMNullableResourcePlan implements org.apache.thrift.TBase<WMNullableResourcePlan, WMNullableResourcePlan._Fields>, java.io.Serializable, Cloneable, Comparable<WMNullableResourcePlan> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMNullableResourcePlan");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField QUERY_PARALLELISM_FIELD_DESC = new org.apache.thrift.protocol.TField("queryParallelism", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField IS_SET_QUERY_PARALLELISM_FIELD_DESC = new org.apache.thrift.protocol.TField("isSetQueryParallelism", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField DEFAULT_POOL_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("defaultPoolPath", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField IS_SET_DEFAULT_POOL_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("isSetDefaultPoolPath", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WMNullableResourcePlanStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WMNullableResourcePlanTupleSchemeFactory());
  }

  private String name; // optional
  private WMResourcePlanStatus status; // optional
  private int queryParallelism; // optional
  private boolean isSetQueryParallelism; // optional
  private String defaultPoolPath; // optional
  private boolean isSetDefaultPoolPath; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    /**
     * 
     * @see WMResourcePlanStatus
     */
    STATUS((short)2, "status"),
    QUERY_PARALLELISM((short)4, "queryParallelism"),
    IS_SET_QUERY_PARALLELISM((short)5, "isSetQueryParallelism"),
    DEFAULT_POOL_PATH((short)6, "defaultPoolPath"),
    IS_SET_DEFAULT_POOL_PATH((short)7, "isSetDefaultPoolPath");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // STATUS
          return STATUS;
        case 4: // QUERY_PARALLELISM
          return QUERY_PARALLELISM;
        case 5: // IS_SET_QUERY_PARALLELISM
          return IS_SET_QUERY_PARALLELISM;
        case 6: // DEFAULT_POOL_PATH
          return DEFAULT_POOL_PATH;
        case 7: // IS_SET_DEFAULT_POOL_PATH
          return IS_SET_DEFAULT_POOL_PATH;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __QUERYPARALLELISM_ISSET_ID = 0;
  private static final int __ISSETQUERYPARALLELISM_ISSET_ID = 1;
  private static final int __ISSETDEFAULTPOOLPATH_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.STATUS,_Fields.QUERY_PARALLELISM,_Fields.IS_SET_QUERY_PARALLELISM,_Fields.DEFAULT_POOL_PATH,_Fields.IS_SET_DEFAULT_POOL_PATH};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, WMResourcePlanStatus.class)));
    tmpMap.put(_Fields.QUERY_PARALLELISM, new org.apache.thrift.meta_data.FieldMetaData("queryParallelism", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_SET_QUERY_PARALLELISM, new org.apache.thrift.meta_data.FieldMetaData("isSetQueryParallelism", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DEFAULT_POOL_PATH, new org.apache.thrift.meta_data.FieldMetaData("defaultPoolPath", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_SET_DEFAULT_POOL_PATH, new org.apache.thrift.meta_data.FieldMetaData("isSetDefaultPoolPath", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMNullableResourcePlan.class, metaDataMap);
  }

  public WMNullableResourcePlan() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMNullableResourcePlan(WMNullableResourcePlan other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    this.queryParallelism = other.queryParallelism;
    this.isSetQueryParallelism = other.isSetQueryParallelism;
    if (other.isSetDefaultPoolPath()) {
      this.defaultPoolPath = other.defaultPoolPath;
    }
    this.isSetDefaultPoolPath = other.isSetDefaultPoolPath;
  }

  public WMNullableResourcePlan deepCopy() {
    return new WMNullableResourcePlan(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.status = null;
    setQueryParallelismIsSet(false);
    this.queryParallelism = 0;
    setIsSetQueryParallelismIsSet(false);
    this.isSetQueryParallelism = false;
    this.defaultPoolPath = null;
    setIsSetDefaultPoolPathIsSet(false);
    this.isSetDefaultPoolPath = false;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  /**
   * 
   * @see WMResourcePlanStatus
   */
  public WMResourcePlanStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see WMResourcePlanStatus
   */
  public void setStatus(WMResourcePlanStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getQueryParallelism() {
    return this.queryParallelism;
  }

  public void setQueryParallelism(int queryParallelism) {
    this.queryParallelism = queryParallelism;
    setQueryParallelismIsSet(true);
  }

  public void unsetQueryParallelism() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __QUERYPARALLELISM_ISSET_ID);
  }

  /** Returns true if field queryParallelism is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryParallelism() {
    return EncodingUtils.testBit(__isset_bitfield, __QUERYPARALLELISM_ISSET_ID);
  }

  public void setQueryParallelismIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __QUERYPARALLELISM_ISSET_ID, value);
  }

  public boolean isIsSetQueryParallelism() {
    return this.isSetQueryParallelism;
  }

  public void setIsSetQueryParallelism(boolean isSetQueryParallelism) {
    this.isSetQueryParallelism = isSetQueryParallelism;
    setIsSetQueryParallelismIsSet(true);
  }

  public void unsetIsSetQueryParallelism() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISSETQUERYPARALLELISM_ISSET_ID);
  }

  /** Returns true if field isSetQueryParallelism is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSetQueryParallelism() {
    return EncodingUtils.testBit(__isset_bitfield, __ISSETQUERYPARALLELISM_ISSET_ID);
  }

  public void setIsSetQueryParallelismIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISSETQUERYPARALLELISM_ISSET_ID, value);
  }

  public String getDefaultPoolPath() {
    return this.defaultPoolPath;
  }

  public void setDefaultPoolPath(String defaultPoolPath) {
    this.defaultPoolPath = defaultPoolPath;
  }

  public void unsetDefaultPoolPath() {
    this.defaultPoolPath = null;
  }

  /** Returns true if field defaultPoolPath is set (has been assigned a value) and false otherwise */
  public boolean isSetDefaultPoolPath() {
    return this.defaultPoolPath != null;
  }

  public void setDefaultPoolPathIsSet(boolean value) {
    if (!value) {
      this.defaultPoolPath = null;
    }
  }

  public boolean isIsSetDefaultPoolPath() {
    return this.isSetDefaultPoolPath;
  }

  public void setIsSetDefaultPoolPath(boolean isSetDefaultPoolPath) {
    this.isSetDefaultPoolPath = isSetDefaultPoolPath;
    setIsSetDefaultPoolPathIsSet(true);
  }

  public void unsetIsSetDefaultPoolPath() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISSETDEFAULTPOOLPATH_ISSET_ID);
  }

  /** Returns true if field isSetDefaultPoolPath is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSetDefaultPoolPath() {
    return EncodingUtils.testBit(__isset_bitfield, __ISSETDEFAULTPOOLPATH_ISSET_ID);
  }

  public void setIsSetDefaultPoolPathIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISSETDEFAULTPOOLPATH_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((WMResourcePlanStatus)value);
      }
      break;

    case QUERY_PARALLELISM:
      if (value == null) {
        unsetQueryParallelism();
      } else {
        setQueryParallelism((Integer)value);
      }
      break;

    case IS_SET_QUERY_PARALLELISM:
      if (value == null) {
        unsetIsSetQueryParallelism();
      } else {
        setIsSetQueryParallelism((Boolean)value);
      }
      break;

    case DEFAULT_POOL_PATH:
      if (value == null) {
        unsetDefaultPoolPath();
      } else {
        setDefaultPoolPath((String)value);
      }
      break;

    case IS_SET_DEFAULT_POOL_PATH:
      if (value == null) {
        unsetIsSetDefaultPoolPath();
      } else {
        setIsSetDefaultPoolPath((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case STATUS:
      return getStatus();

    case QUERY_PARALLELISM:
      return getQueryParallelism();

    case IS_SET_QUERY_PARALLELISM:
      return isIsSetQueryParallelism();

    case DEFAULT_POOL_PATH:
      return getDefaultPoolPath();

    case IS_SET_DEFAULT_POOL_PATH:
      return isIsSetDefaultPoolPath();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case STATUS:
      return isSetStatus();
    case QUERY_PARALLELISM:
      return isSetQueryParallelism();
    case IS_SET_QUERY_PARALLELISM:
      return isSetIsSetQueryParallelism();
    case DEFAULT_POOL_PATH:
      return isSetDefaultPoolPath();
    case IS_SET_DEFAULT_POOL_PATH:
      return isSetIsSetDefaultPoolPath();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WMNullableResourcePlan)
      return this.equals((WMNullableResourcePlan)that);
    return false;
  }

  public boolean equals(WMNullableResourcePlan that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_queryParallelism = true && this.isSetQueryParallelism();
    boolean that_present_queryParallelism = true && that.isSetQueryParallelism();
    if (this_present_queryParallelism || that_present_queryParallelism) {
      if (!(this_present_queryParallelism && that_present_queryParallelism))
        return false;
      if (this.queryParallelism != that.queryParallelism)
        return false;
    }

    boolean this_present_isSetQueryParallelism = true && this.isSetIsSetQueryParallelism();
    boolean that_present_isSetQueryParallelism = true && that.isSetIsSetQueryParallelism();
    if (this_present_isSetQueryParallelism || that_present_isSetQueryParallelism) {
      if (!(this_present_isSetQueryParallelism && that_present_isSetQueryParallelism))
        return false;
      if (this.isSetQueryParallelism != that.isSetQueryParallelism)
        return false;
    }

    boolean this_present_defaultPoolPath = true && this.isSetDefaultPoolPath();
    boolean that_present_defaultPoolPath = true && that.isSetDefaultPoolPath();
    if (this_present_defaultPoolPath || that_present_defaultPoolPath) {
      if (!(this_present_defaultPoolPath && that_present_defaultPoolPath))
        return false;
      if (!this.defaultPoolPath.equals(that.defaultPoolPath))
        return false;
    }

    boolean this_present_isSetDefaultPoolPath = true && this.isSetIsSetDefaultPoolPath();
    boolean that_present_isSetDefaultPoolPath = true && that.isSetIsSetDefaultPoolPath();
    if (this_present_isSetDefaultPoolPath || that_present_isSetDefaultPoolPath) {
      if (!(this_present_isSetDefaultPoolPath && that_present_isSetDefaultPoolPath))
        return false;
      if (this.isSetDefaultPoolPath != that.isSetDefaultPoolPath)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status.getValue());

    boolean present_queryParallelism = true && (isSetQueryParallelism());
    list.add(present_queryParallelism);
    if (present_queryParallelism)
      list.add(queryParallelism);

    boolean present_isSetQueryParallelism = true && (isSetIsSetQueryParallelism());
    list.add(present_isSetQueryParallelism);
    if (present_isSetQueryParallelism)
      list.add(isSetQueryParallelism);

    boolean present_defaultPoolPath = true && (isSetDefaultPoolPath());
    list.add(present_defaultPoolPath);
    if (present_defaultPoolPath)
      list.add(defaultPoolPath);

    boolean present_isSetDefaultPoolPath = true && (isSetIsSetDefaultPoolPath());
    list.add(present_isSetDefaultPoolPath);
    if (present_isSetDefaultPoolPath)
      list.add(isSetDefaultPoolPath);

    return list.hashCode();
  }

  @Override
  public int compareTo(WMNullableResourcePlan other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueryParallelism()).compareTo(other.isSetQueryParallelism());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryParallelism()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryParallelism, other.queryParallelism);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsSetQueryParallelism()).compareTo(other.isSetIsSetQueryParallelism());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSetQueryParallelism()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isSetQueryParallelism, other.isSetQueryParallelism);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDefaultPoolPath()).compareTo(other.isSetDefaultPoolPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefaultPoolPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.defaultPoolPath, other.defaultPoolPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsSetDefaultPoolPath()).compareTo(other.isSetIsSetDefaultPoolPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSetDefaultPoolPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isSetDefaultPoolPath, other.isSetDefaultPoolPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("WMNullableResourcePlan(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetQueryParallelism()) {
      if (!first) sb.append(", ");
      sb.append("queryParallelism:");
      sb.append(this.queryParallelism);
      first = false;
    }
    if (isSetIsSetQueryParallelism()) {
      if (!first) sb.append(", ");
      sb.append("isSetQueryParallelism:");
      sb.append(this.isSetQueryParallelism);
      first = false;
    }
    if (isSetDefaultPoolPath()) {
      if (!first) sb.append(", ");
      sb.append("defaultPoolPath:");
      if (this.defaultPoolPath == null) {
        sb.append("null");
      } else {
        sb.append(this.defaultPoolPath);
      }
      first = false;
    }
    if (isSetIsSetDefaultPoolPath()) {
      if (!first) sb.append(", ");
      sb.append("isSetDefaultPoolPath:");
      sb.append(this.isSetDefaultPoolPath);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WMNullableResourcePlanStandardSchemeFactory implements SchemeFactory {
    public WMNullableResourcePlanStandardScheme getScheme() {
      return new WMNullableResourcePlanStandardScheme();
    }
  }

  private static class WMNullableResourcePlanStandardScheme extends StandardScheme<WMNullableResourcePlan> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WMNullableResourcePlan struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = org.apache.hadoop.hive.metastore.api.WMResourcePlanStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUERY_PARALLELISM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.queryParallelism = iprot.readI32();
              struct.setQueryParallelismIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_SET_QUERY_PARALLELISM
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isSetQueryParallelism = iprot.readBool();
              struct.setIsSetQueryParallelismIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DEFAULT_POOL_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.defaultPoolPath = iprot.readString();
              struct.setDefaultPoolPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // IS_SET_DEFAULT_POOL_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isSetDefaultPoolPath = iprot.readBool();
              struct.setIsSetDefaultPoolPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, WMNullableResourcePlan struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          oprot.writeI32(struct.status.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetQueryParallelism()) {
        oprot.writeFieldBegin(QUERY_PARALLELISM_FIELD_DESC);
        oprot.writeI32(struct.queryParallelism);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsSetQueryParallelism()) {
        oprot.writeFieldBegin(IS_SET_QUERY_PARALLELISM_FIELD_DESC);
        oprot.writeBool(struct.isSetQueryParallelism);
        oprot.writeFieldEnd();
      }
      if (struct.defaultPoolPath != null) {
        if (struct.isSetDefaultPoolPath()) {
          oprot.writeFieldBegin(DEFAULT_POOL_PATH_FIELD_DESC);
          oprot.writeString(struct.defaultPoolPath);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsSetDefaultPoolPath()) {
        oprot.writeFieldBegin(IS_SET_DEFAULT_POOL_PATH_FIELD_DESC);
        oprot.writeBool(struct.isSetDefaultPoolPath);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WMNullableResourcePlanTupleSchemeFactory implements SchemeFactory {
    public WMNullableResourcePlanTupleScheme getScheme() {
      return new WMNullableResourcePlanTupleScheme();
    }
  }

  private static class WMNullableResourcePlanTupleScheme extends TupleScheme<WMNullableResourcePlan> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMNullableResourcePlan struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetStatus()) {
        optionals.set(1);
      }
      if (struct.isSetQueryParallelism()) {
        optionals.set(2);
      }
      if (struct.isSetIsSetQueryParallelism()) {
        optionals.set(3);
      }
      if (struct.isSetDefaultPoolPath()) {
        optionals.set(4);
      }
      if (struct.isSetIsSetDefaultPoolPath()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetQueryParallelism()) {
        oprot.writeI32(struct.queryParallelism);
      }
      if (struct.isSetIsSetQueryParallelism()) {
        oprot.writeBool(struct.isSetQueryParallelism);
      }
      if (struct.isSetDefaultPoolPath()) {
        oprot.writeString(struct.defaultPoolPath);
      }
      if (struct.isSetIsSetDefaultPoolPath()) {
        oprot.writeBool(struct.isSetDefaultPoolPath);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMNullableResourcePlan struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.status = org.apache.hadoop.hive.metastore.api.WMResourcePlanStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(2)) {
        struct.queryParallelism = iprot.readI32();
        struct.setQueryParallelismIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isSetQueryParallelism = iprot.readBool();
        struct.setIsSetQueryParallelismIsSet(true);
      }
      if (incoming.get(4)) {
        struct.defaultPoolPath = iprot.readString();
        struct.setDefaultPoolPathIsSet(true);
      }
      if (incoming.get(5)) {
        struct.isSetDefaultPoolPath = iprot.readBool();
        struct.setIsSetDefaultPoolPathIsSet(true);
      }
    }
  }

}

