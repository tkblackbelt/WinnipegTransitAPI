package com.chuck.core.result.stops;

import com.chuck.core.result.location.Centre;
import com.chuck.core.result.location.Street;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.Map;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

@Root(name = "stop")
public class StopNode implements Serializable {

    @Attribute
    private String href;

    @Element
    private String key;

    @Element
    private String name;

    @Element
    private int number;

    @ElementMap(entry = "direction", key = "abbr", inline = true, attribute = true)
    private Map<String, String> direction;

    @ElementMap(entry = "side", key = "abbr", attribute = true, inline = true)
    private Map<String, String> side;

    @Element
    private Street street;

    @Element(name = "cross-street")
    private Street crossStreet;

    @Element
    private Centre centre;

    @Element(required = false)
    private Distance distances;

    public String getHref() {
        return href;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Map<String, String> getDirection() {
        return direction;
    }

    public Map<String, String> getSide() {
        return side;
    }

    public Street getStreet() {
        return street;
    }

    public Street getCrossStreet() {
        return crossStreet;
    }

    public Centre getCentre() {
        return centre;
    }

    public Distance getDistances() {
        return distances;
    }

    @Override
    public String toString() {
        return "StopNode{" +
                "href='" + href + '\'' +
                ", \nkey='" + key + '\'' +
                ", \nname='" + name + '\'' +
                ", \nnumber=" + number +
                ", \ndirection=" + direction +
                ", side=" + side +
                ", street=" + street +
                ", crossStreet=" + crossStreet +
                ", centre=" + centre +
                ", distance=" + distances +
                '}';
    }
}

























