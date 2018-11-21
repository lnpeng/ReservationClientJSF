# ReservationClientJSF

A ReservationClient JSF web application that consumes the Reservation web service.

# Description
ReservationClient JSF web application lets users to select "Aisle", "Middle" or "Window" seats in "Economy" or "First" class, then submit their requests to the web service. If the database request is not successful, the application instructs the user to modify the request and try again.

`index.xhtml` is the default web page for the ReservationClient JSF web application. It lets users to select seat type and reserve a seat.

Class `ReservationBean` defines the `seatType`, `classType` and `result` properties and the `reserveSeat` method that are used in the `index.xhtml` page.

## Getting Started
### Prerequisites
- JDK 1.8
- Java EE 7.0
- GlassFish Server 4.1
- [ReservationSOAPService](https://github.com/lnpeng/ReservationSOAPService)

### Installing
- Creating a local respository.
```
git clone git@github.com:lnpeng/ReservationClientJSF.git
cd ReservationClientJSF
```

- Adding a web service reference to an application.
  - Right click the project name in the NetBeans **Projects** tab and select **New > Web Service Client…** from the pop-up menu.
  - In the **WSDL URL** field, specify the URL `http://localhost:8080/Reservation/ReservationService?WSDL`.
  - Click **Finish** to create the web service reference.
  
## Running the tests
### Test the reservation web application.
- Launch the application from a web browser and submit a reservation request.
- ![ReservationClientJSF](https://github.com/lnpeng/ReservationClientJSF/blob/master/Screen%20Shot%202018-11-20%20at%2012.18.27%20PM.png)

## Deployment
Deploy the war file to [GlassFish](https://javaee.github.io/glassfish/) Server.

## Built With
* [Ant](https://ant.apache.org/) - Automating software build process.
