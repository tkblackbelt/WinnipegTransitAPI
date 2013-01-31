package com.chuck.test;

import com.chuck.core.exceptions.ServiceNotFound;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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

@RunWith(JUnit4.class)
public class RequestTest {

    @Test(expected = RuntimeException.class)
    public void nullQueryObjectShouldReturnNullAndThrowException() throws Exception {
//        WinnipegTransitRequest request = new WinnipegTransitRequest();
//        String resp = request.sendXMLRequest(null);
//        assertTrue("Null query object should return null",resp == null);
    }

    @Test(expected = ServiceNotFound.class)
    public void shouldThrowServiceNotFoundException() throws Exception {


//        final TransitService s = new TransitService() {
//            @Override
//            public String getServiceName(APIMode apiMode) {
//                return "Invalid_service";
//            }
//        };
//
//        String resp = request.sendXMLRequest(new Query(s) {
//            String apiKey;
//            @Override
//            public void setAPIKey(String apiKey) {
//                this.apiKey = apiKey;
//            }
//
//            @Override
//            public HttpGet buildQuery(APIMode apiMode) {
//                return new HttpGet(BASE_REQUEST_URL_WITH_PROTOCOL + s.getServiceName(apiMode) + "?api-key=" + apiKey);
//            }
//        });
//
//        assertTrue("Null query object should return null",resp == null);
    }

}
