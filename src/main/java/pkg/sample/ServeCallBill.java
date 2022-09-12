package pkg.sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class ServeCallBill
 */
public class ServeCallBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeCallBill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List<String> lstitemname = new ArrayList<String>();
		List<Integer> lstitemqty = new ArrayList<Integer>();
		List<Double> lsttimeamt = new ArrayList<Double>();
		double totalbill = 0;
		
		String chboxsoap     = request.getParameter("chboxsoap");
		String chboxchoc     = request.getParameter("chboxchoc");
		String chboxchips    = request.getParameter("chboxchips");
		String chboxshampoo  = request.getParameter("chboxshampoo");
		String chboxmlkpwder = request.getParameter("chboxmlkpwder");
		
		
		String txtsoapqty     = request.getParameter("txtsoapqty");
		String txtchocqty     = request.getParameter("txtchocqty");
		String txtchipsqty    = request.getParameter("txtchipsqty");
		String txtshampooqty  = request.getParameter("txtshampooqty");
		String txtmlkpwqty    = request.getParameter("txtmlkpwqty");
		
		GetPrices prices = new GetPrices();
		
		if(chboxsoap != null)
		{
			int qty = Integer.valueOf(txtsoapqty);
			double price = prices.getSoapPrice();
			double totamt = price*qty;
			totalbill = totalbill+totamt;
			
			lstitemname.add("soap");
			lstitemqty.add(qty);
			lsttimeamt.add(totamt);
		}
		
		if(chboxchoc != null)
		{
			int qty = Integer.valueOf(txtchocqty);
			double price = prices.getChocPrice();
			double totamt = price*qty;
			totalbill = totalbill+totamt;
			
			lstitemname.add("Chocolate");
			lstitemqty.add(qty);
			lsttimeamt.add(totamt);
		}
		
		if( chboxchips != null)
		{
			int qty = Integer.valueOf(txtchipsqty);
			double price = prices.getChipsPrice();
			double totamt = price*qty;
			totalbill = totalbill+totamt;
			
			lstitemname.add("Chips");
			lstitemqty.add(qty);
			lsttimeamt.add(totamt);
		}
		
		if( chboxshampoo != null)
		{
			int qty = Integer.valueOf(txtshampooqty);
			double price = prices.getShampooPrice();
			double totamt = price*qty;
			totalbill = totalbill+totamt;
			
			lstitemname.add("Shampoo");
			lstitemqty.add(qty);
			lsttimeamt.add(totamt);
		}
		
		if( chboxmlkpwder != null)
		{
			int qty = Integer.valueOf(txtmlkpwqty);
			double price = prices.getMilkPowderPrice();
			double totamt = price*qty;
			totalbill = totalbill+totamt;
			
			lstitemname.add("Milk Powder");
			lstitemqty.add(qty);
			lsttimeamt.add(totamt);
		}
		
		
		HttpSession session = request.getSession();
		session.setAttribute("ItemName", lstitemname);
		session.setAttribute("ItemQuantity", lstitemqty);
		session.setAttribute("ItemToalAmount", lsttimeamt);
		session.setAttribute("totalAmt", totalbill);
		
		response.sendRedirect("Bill.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
