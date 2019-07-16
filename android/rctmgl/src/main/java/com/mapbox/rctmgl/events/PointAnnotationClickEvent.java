package com.mapbox.rctmgl.events;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import android.view.View;

import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.rctmgl.events.constants.EventKeys;
import com.mapbox.rctmgl.events.constants.EventTypes;

/**
 * Created by nickitaliano on 10/11/17.
 */

public class PointAnnotationClickEvent extends MapClickEvent {
    public PointAnnotationClickEvent(View view, @NonNull LatLng latLng, @NonNull PointF screenPoint, String eventType) {
        super(view, latLng, screenPoint, eventType);
    }

    @Override
    public String getKey() {
        return getType().equals(EventTypes.ANNOTATION_SELECTED) ? EventKeys.POINT_ANNOTATION_SELECTED : EventKeys.POINT_ANNOTATION_DESELECTED;
    }
}
