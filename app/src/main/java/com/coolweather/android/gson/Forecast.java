package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String data;

    @SerializedName("tmp")
    public Temperation temperature;

    @SerializedName("cond")
    public More more;

    public class Temperation{

        public String max;

        public String min;

    }

    public class More{

        @SerializedName("txt_d")
        public String info;

    }

}
