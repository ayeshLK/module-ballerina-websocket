/*
 *  Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package io.ballerina.stdlib.websocket;

import io.ballerina.stdlib.http.transport.contract.PortBindingEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintStream;

/**
 * An implementation of the LifeCycleEventListener. This can be used to listen to the WebSocket connector
 * life cycle events.
 */
public class WebSocketConnectorPortBindingListener implements PortBindingEventListener {
    private static final Logger log = LoggerFactory.getLogger(WebSocketConnectorPortBindingListener.class);
    private static final PrintStream console = System.out;

    @Override
    public void onOpen(String serverConnectorId, boolean wss) {

    }

    @Override
    public void onClose(String serverConnectorId, boolean wss) {

    }

    @Override
    public void onError(Throwable throwable) {
        log.debug("Error in WS endpoint", throwable);
    }
}
