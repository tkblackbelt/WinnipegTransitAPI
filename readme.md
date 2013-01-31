#Winnipeg Transit API
##Introduction
This is a simple Java library fully compatible with Android to make use of the Winnipeg Transit API (http://api.winnipegtransit.com).

##Usage
The API is pretty simple just create and instance of WinnipegTransitRequest class and you're good to go

	// Pull locations around a geographic coordinate within 100 meters with a limit of 10
	WinnipegTransitRequest winnipegTransitRequest = new WinnipegTransitRequest("7etYvCE5gIvO3t8K8P");
    Location location = Location.getInstance();
    winnipegTransitRequest.sendRequest(location.atGeographicCoordinate(49.895, 97.138, 100, 10));

##Dependancies
The following libraries are required to use WinnipegTransitAPI. Android has these by default.
commons-logging-1.1.1.jar
httpclient-4.2.3.jar
httpcore-4.2.2.jar
json-java.jar
This file was modified by IntelliJ IDEA 12.0.2 for binding GitHub repository