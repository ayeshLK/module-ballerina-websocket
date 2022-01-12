// Copyright (c) 2021 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
//
// WSO2 Inc. licenses this file to you under the Apache License,
// Version 2.0 (the "License"); you may not use this file except
// in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

import ballerina/io;
import ballerina/websocket;

public function main() returns error? {
    string username = io:readln("Enter username: ");
    // Users can register simply by connecting to the server.
    websocket:Client riderClient = check new(string `ws://localhost:9091/subscribe/${username}`);
   
   // Continuously read the location updates coming from the server.
    while true {
        string textResp = check riderClient->readTextMessage();
        io:println(textResp);
    }
}
