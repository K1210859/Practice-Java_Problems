/*public class Airport {
    private ArrayList<Flight> allFlights;
    public double getTotalRevenue()
    {
        double total = 0;
        for(int i=0;i<allFlights.size();i++)
        {
            Flight f = allFlights.get(i);
            int fCapacity = f.getCapacity();
            double fPrice = f.getPrice();
            int fPassengers = f.getNumPassengers();
            if(fCapacity>=fPassengers)
            {
                double product = fPassengers*fPrice;
                total+=product;
            }
            else if(fCapacity<fPassengers)
            {
                double product = fCapacity*fPrice;
                total+=product;
            }
        }
        return total;
    }
    public int updateFlights()
    {
        int total = 0;
        for(int i=0;i<allFlights.size();i++)
        {
            Flight f = allFlights.get(i);
            int fCapacity = f.getCapacity();
            int fPassengers = f.getNumPassengers();
            double newCap = (0.2*fCapacity);
            if(fPassengers<newCap)
            {
                total+=fPassengers;
                allFlights.remove(f);
                i--;
            }
        }
        return total;
    }
    public Flight getMostLuggageCapacity()
    {
        // you must create a variable in the Flight class that keeps track of the weight in luggage that each passenger in each flight has so that you can add all the weights to get the total amount of weight in the flight - this can be done with an arraylist of doubles that has all the luggage weights per passenger
        // you must also hcreate a method in the Flight class that returns the maximum weight of luggage that each passenger can have and this
        //
    }
}
*/