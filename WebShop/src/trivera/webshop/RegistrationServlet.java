package trivera.webshop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import trivera.webshop.model.Customer;
import trivera.webshop.model.CustomerService;

/**
 * Servlet implementation class RegistrationServlet
 */

@WebServlet(name="RegistrationServlet",urlPatterns="/Registration",
initParams={@WebInitParam(name="minimumAge",value="18")})
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private int minimumAge;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();

    }

	@Override
	public void init() throws ServletException {
		ServletConfig config = getServletConfig();	
		String minimumAgeInitValue = config.getInitParameter("minimumAge");
		this.minimumAge = Integer.parseInt(minimumAgeInitValue);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String command = request.getParameter("command");
		
		if("cancel".equals(command)){
			response.sendRedirect("Welcome.jsp");
			return;
		}
		
		
		String firstName = request.getParameter("first-name");
		String familyName = request.getParameter("family-name");
		String dateOfBirth = request.getParameter("dateOfBirth");
		String email = request.getParameter("email");		

		CustomerService service = new CustomerService();	
		Customer customer = service.addCustomer(firstName,familyName,dateOfBirth,email);
		HttpSession session = request.getSession();
		session.setAttribute("customer",customer);
		
		if(customer.getCustomerAge() < minimumAge){
			request.setAttribute("error", "You are not old enough to register");
			
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
			return;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("RegistrationComplete.jsp");
		rd.forward(request, response);

	}

}
