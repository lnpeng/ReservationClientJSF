// Bean for seat reservation client.
package com.reservationclient;

import com.reservation.Reservation;
import com.reservation.ReservationService;
import java.io.Serializable;
import javax.inject.Named;

@Named("reservationBean")
@javax.faces.view.ViewScoped
public class ReservationBean implements Serializable
{
    // references the service endpoint interface object (i.e., the proxy)
    private Reservation reservationServiceProxy; // reference to proxy
    private String seatType; // type of seat to reserve
    private String classType; // class of seat to reserve
    private String result; // result of reservation attempt

    // no-argument constructor
    public ReservationBean()
    {
        // get service endpoint interface
        ReservationService reservationService = new ReservationService();
        reservationServiceProxy = reservationService.getReservationPort();
    }
    
    // return classType
    public String getClassType()
    {
        return classType;
    }
    
    // set classType
    public void setClassType(String classType)
    {
        this.classType = classType;
    }

    // return seatType
    public String getSeatType()
    {
        return seatType;
    }

    // set seatType
    public void setSeatType(String seatType)
    {
        this.seatType = seatType;
    }

    // return result
    public String getResult()
    {   
        return result;
    }
    
    // invoke the web service when the user clicks Reserve button
    public void reserveSeat()
    {
        try
        {
            boolean reserved = reservationServiceProxy.reserve(
                getSeatType(), getClassType());
            if (reserved)
                result = "Your reservation has been made. Thank you!";
            else
                result = "This type of seat is not available. " +
                    "Please modify your request and try again.";
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
