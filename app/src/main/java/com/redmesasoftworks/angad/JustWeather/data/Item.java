package com.redmesasoftworks.angad.JustWeather.data;

import org.json.JSONObject;

/**
 * Created by angad on 2/2/2016.
 */
public class Item implements JSONPopulator {

    private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public void populate(JSONObject data) {

        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));
    }
}
