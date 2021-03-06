package com.chuck.core.result.variant;

import com.chuck.core.result.NodeWithHref;
import com.chuck.core.result.Result;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

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

@Root
public class Variant extends Result {

    @Attribute
    private String href;

    @Element
    private String key;

    @Element
    private String name;

    @Element(required = false)
    private String description;

    @Element
    private NodeWithHref destinations;

    public String getHref() {
        return href;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public NodeWithHref getDestinations() {
        return destinations;
    }

    @Override
    public String toString() {
        return "\nVariant{" +
                "href='" + href + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", destinations=" + destinations +
                '}';
    }
}
