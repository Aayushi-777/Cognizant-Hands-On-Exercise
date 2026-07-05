public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public String findCustomerById(int id){
        return "Customer Id: "+id+", Name: Aayushi Vinod";
    }
}