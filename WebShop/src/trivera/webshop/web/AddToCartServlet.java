package trivera.webshop.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import trivera.webshop.model.Bluray;
import trivera.webshop.model.ShoppingCart;
import trivera.webshop.model.dao.BlurayDAO;
import trivera.webshop.model.dao.file.BlurayFileDAO;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/AddToCart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CART_NAME="shoppingcart";
 
	
	protected Bluray getBlurayByID(String blurayID){
		BlurayDAO dao = new BlurayFileDAO();
		return dao.getBluRayByID(blurayID);
	}


	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String blurayID = request.getParameter("ID");
		
		Bluray bluRayByID = getBlurayByID(blurayID);
		
		if(bluRayByID != null){
			HttpSession session = request.getSession();
			ShoppingCart cart = (ShoppingCart)session.getAttribute(CART_NAME);
			if(cart == null){
				cart = new ShoppingCart();
				session.setAttribute(CART_NAME, cart);
			}
			cart.addBluray(bluRayByID);
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("SearchForm.jsp");
		requestDispatcher.forward(request, response);
	}
}
