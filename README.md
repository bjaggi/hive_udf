# hive_udf
# steps on the terminal





drop function if exists converter;
add jar hdfs:///tmp/hiveudfs/udf-1.0.jar;

CREATE FUNCTION converter as 'com.jaggi.hive.CurrencyConverter' USING JAR 'hdfs:///tmp/hiveudfs/udf-1.0.jar'

