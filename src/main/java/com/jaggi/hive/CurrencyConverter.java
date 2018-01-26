
package com.jaggi.hive;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;


@Description(
        name = "currencyconverter",
        value = "_FUNC_(string) - doubles the input number if number of writes "
)

public class CurrencyConverter extends UDF {

    public Text evaluate(final Text s) {
        if (s == null) {
            return new Text("INPUT_IS_NULL");
        }

        int convertedValue;
        try {
            int result = Integer.parseInt(s.toString());
            convertedValue = result * 2;
        } catch(Exception e){
            e.printStackTrace();
            return new Text("DOUBLE" + s.toString());
        }


    return new Text(new Integer(convertedValue).toString());
    }

}
