package com.chuck.core.result.location;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

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
 * <p/>
 * User: chuck
 * Date: 31/01/13
 * Time: 1:00 PM
 */
@Root
public class Centre implements Serializable {

    @Attribute(name = "xmlns:utm", required = false)
    private String utm_attr;

    @Attribute(name = "xmlns:ang", required = false)
    private String ang;

    @Element
    private Utm utm;

    @Element
    private Geographic geographic;

    public String getUtm_attr() {
        return utm_attr;
    }

    public String getAng() {
        return ang;
    }

    public Utm getUtm() {
        return utm;
    }

    public Geographic getGeographic() {
        return geographic;
    }

    @Override
    public String toString() {
        return "Centre{" +
                "utm_attr='" + utm_attr + '\'' +
                ", ang='" + ang + '\'' +
                ", utm=" + utm +
                ", geographic=" + geographic +
                '}';
    }
}
