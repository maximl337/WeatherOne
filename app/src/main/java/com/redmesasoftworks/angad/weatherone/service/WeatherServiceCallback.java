package com.redmesasoftworks.angad.weatherone.service;

import com.redmesasoftworks.angad.weatherone.data.Channel;

/**
 * Created by angad on 2/2/2016.
 */
public interface WeatherServiceCallback {

    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
