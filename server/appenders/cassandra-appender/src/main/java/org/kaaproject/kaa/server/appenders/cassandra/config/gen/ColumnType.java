/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.cassandra.config.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum ColumnType {
  BIGINT, BLOB, BOOLEAN, DOUBLE, FLOAT, INT, TEXT, UUID;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"ColumnType\",\"namespace\":\"org.kaaproject.kaa.server.appenders.cassandra.config.gen\",\"symbols\":[\"BIGINT\",\"BLOB\",\"BOOLEAN\",\"DOUBLE\",\"FLOAT\",\"INT\",\"TEXT\",\"UUID\"]}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }
}
