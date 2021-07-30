import java.time.LocalDateTime;



public class MovieTicket {

	
	String movieTitle =null ; 
	LocalDateTime movieDateTime = null;    
	String theaterName = "Cinerama";                    
	int screenNbr = 1;                            
	int seatNbr = 0;

                
public String getMovieTitle() {
	return movieTitle;
}
public void setMovieTitle(String movieTitle) {
	this.movieTitle = "Alita";
}
public LocalDateTime getMovieDateTime() {
	return movieDateTime;
}
public void setMovieDateTime(LocalDateTime movieDateTime) {
	this.movieDateTime = movieDateTime;
}
public String getTheaterName() {
	return theaterName;
}
public void setTheaterName(String theaterName) {
	this.theaterName = theaterName;
}
public int getScreenNbr() {
	return screenNbr;
}
public void setScreenNbr(int screenNbr) {
	this.screenNbr = screenNbr;
}
public int getSeatNbr() {
	return seatNbr;
}
public void setSeatNbr(int seatNbr) {
	
	this.seatNbr = seatNbr;
}

@Override
public String toString() {
	return "MovieTicket [movieTitle=" + movieTitle + ", movieDateTime=" + movieDateTime + ", theaterName="
			+ theaterName + ", screenNbr=" + screenNbr + ", seatNbr=" + seatNbr + "] isValid - " +isValid() ;
}

public boolean isValid()
{
    if (seatNbr != 0 && movieTitle != null)
    {
        return true;
    }
    else
    {
        return false;
    }
}


public MovieTicket() {
this.movieTitle =null ; 
this.movieDateTime = null;                              
this.seatNbr = 0;
                
}

public MovieTicket(String movieTitle, LocalDateTime movieDateTime) {
this.movieTitle = "Alita"; 
this.movieDateTime = movieDateTime;                              
}


public MovieTicket(String movieTitle, LocalDateTime movieDateTime, 	int seatNbr ) {
this.movieTitle ="Alita"; 
this.movieDateTime =  movieDateTime;                              
this.seatNbr = 55;
}

}

	

