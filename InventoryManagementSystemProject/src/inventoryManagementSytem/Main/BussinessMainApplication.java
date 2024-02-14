package inventoryManagementSytem.Main;

import java.sql.SQLException;
import java.util.Scanner;

import inventoryManagementSytem.AllInstance.*;

public class BussinessMainApplication {
public static void main(String[] args) throws SQLException {
	
	Registrations registration=new Registrations();
	PurchaseOrders purchaseOrders=new PurchaseOrders();
	AdminLogins adminlogin=new AdminLogins();
	Products product=new Products();
	Suppliers suppliers=new Suppliers();
	
	Logins login=new Logins();
	//create all tables
	CreateAllTables.createAllTables();
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("registration");
	System.out.println("purchaseOrders");
	System.out.println("adminlogin");
	System.out.println("product");
	String s=sc.next();
	
	if(s.equals("registration")) {
		registration.addDetails();
		System.out.println("Please login :");
		if(registration.checkCredintials()) {
			product.retrieveAllDetails();
			System.out.print("order : ");
			
			String order=sc.next();
			
			if(order.equals("order")) {
				purchaseOrders.addDetails();
			}
			sc.nextLine();
			System.out.print("Admin login : ");
			
			String admin=sc.nextLine();
			
			if(admin.equals("Admin login")) {
				if(adminlogin.checkcredentials()) {
					System.out.println("product data : ");
					product.retrieveAllDetails();
					System.out.println("purchaseorder data : ");
					purchaseOrders.retrieveAllDetails();
					System.out.println("login data : ");
					login.retrieveAllDetails();
				}
				System.out.println("addData");
				System.out.println("deleteData");
				System.out.println("update");
				System.out.println("retrieveId");
				System.out.println("retrieveAll");
				System.out.print("enter what you want to perform CRUDoperations :");
				for(int i=0;i<=5;i++) {
				String edit=sc.nextLine();
				if(edit.equals("addData")) {
					System.out.println("product");
					System.out.println("purchaseOrders");
					System.out.println("Admindetails");
					System.out.println("Registration");
					String pro=sc.next();
					
					if(pro.equals("product")) {
						product.addDetails();
					}
					else if(pro.equals("purchaseOrders")) {
						purchaseOrders.addDetails();
					}
					else if(pro.equals("Admindetails")) {
						adminlogin.addDetails();
					}
					else if(pro.equals("Registration")) {
						registration.addDetails();
					}
					
				}
				else if(edit.equals("deleteData")) {
					System.out.println("product");
					System.out.println("purchaseOrders");
					System.out.println("Admindetails");
					System.out.println("Registration");
					String pro=sc.next();
					
					if(pro.equals("product")) {
						product.deleteDetail();;
					}
					else if(pro.equals("purchaseOrders")) {
						purchaseOrders.deleteDetail();;
					}
					else if(pro.equals("Admindetails")) {
						adminlogin.deleteDetail();;
					}
					else if(pro.equals("Registration")) {
						registration.deleteDetail();;
					}
				}
				else if(edit.equals("update")) {
					System.out.println("product");
					System.out.println("purchaseOrders");
					System.out.println("Admindetails");
					System.out.println("Registration");
					String pro=sc.next();
					
					if(pro.equals("product")) {
						product.updateDetails();
					}
					else if(pro.equals("purchaseOrders")) {
						purchaseOrders.updateDetails();
					}
					else if(pro.equals("Admindetails")) {
						adminlogin.updateDetails();
					}
					else if(pro.equals("Registration")) {
						registration.updateDetails();
					}
				}
				else if(edit.equals("retrieveId")) {
					System.out.println("product");
					System.out.println("purchaseOrders");
					System.out.println("Admindetails");
					System.out.println("Registration");
					String pro=sc.next();
					
					if(pro.equals("product")) {
						product.retrieveDetailById();
					}
					else if(pro.equals("purchaseOrders")) {
						purchaseOrders.retrieveDetailById();
					}
					else if(pro.equals("Admindetails")) {
						adminlogin.retrieveDetailById();
					}
					else if(pro.equals("Registration")) {
						registration.retrieveDetailById();
					}
				}
				else if(edit.equals("retrieveAll")) {
					System.out.println("product");
					System.out.println("purchaseOrders");
					System.out.println("Admindetails");
					System.out.println("Registration");
					String pro=sc.next();
					
					if(pro.equals("product")) {
						product.retrieveAllDetails();
					}
					else if(pro.equals("purchaseOrders")) {
						purchaseOrders.retrieveAllDetails();
					}
					else if(pro.equals("Admindetails")) {
						adminlogin.retrieveAllDetails();
					}
					else if(pro.equals("Registration")) {
						registration.retrieveAllDetails();
					}
				}
				
				}
				
			}
			
			
		}
		
		
		
	}
	else if(s.equals("product")) {
		System.out.println("addData");
		System.out.println("retreiveall");
		System.out.println("retreiveid");
		System.out.println("delete");
		System.out.println("update");
		String operation=sc.next();
		if(operation.equals("addData")) {
			product.addDetails();
		}
		else if(operation.equals("retreiveall")) {
			product.retrieveAllDetails();
		}
		else if(operation.equals("retreiveid")) {
			product.retrieveDetailById();	
		}
		else if(operation.equals("delete")) {
			product.deleteDetail();
		}
		else if(operation.equals("update")) {
			product.updateDetails();
		}
		
	}
	else if(s.equals("purchaseOrders")) {
		System.out.println("addData");
		System.out.println("retreiveall");
		System.out.println("retreiveid");
		System.out.println("delete");
		System.out.println("update");
		String operation=sc.next();
		if(operation.equals("addData")) {
			purchaseOrders.addDetails();
		}
		else if(operation.equals("retreiveall")) {
			purchaseOrders.retrieveAllDetails();
		}
		else if(operation.equals("retreiveid")) {
			purchaseOrders.retrieveDetailById();	
		}
		else if(operation.equals("delete")) {
			purchaseOrders.deleteDetail();
		}
		else if(operation.equals("update")) {
			purchaseOrders.updateDetails();
		}
	}
	else if(s.equals("adminlogin")) {
		System.out.println("addData");
		System.out.println("retreiveall");
		System.out.println("retreiveid");
		System.out.println("delete");
		System.out.println("update");
		String operation=sc.next();
		if(operation.equals("addData")) {
			adminlogin.addDetails();
		}
		else if(operation.equals("retreiveall")) {
			adminlogin.retrieveAllDetails();
		}
		else if(operation.equals("retreiveid")) {
			adminlogin.retrieveDetailById();	
		}
		else if(operation.equals("delete")) {
			adminlogin.deleteDetail();
		}
		else if(operation.equals("update")) {
			adminlogin.updateDetails();
		}
	}
	else if(s.equals("registration")) {
		System.out.println("addData");
		System.out.println("retreiveall");
		System.out.println("retreiveid");
		System.out.println("delete");
		System.out.println("update");
		String operation=sc.next();
		if(operation.equals("addData")) {
			registration.addDetails();
		}
		else if(operation.equals("retreiveall")) {
			registration.retrieveAllDetails();
		}
		else if(operation.equals("retreiveid")) {
			registration.retrieveDetailById();	
		}
	
		else if(operation.equals("delete")) {
			registration.deleteDetail();
		}
		else if(operation.equals("update")) {
			registration.updateDetails();
		}
	}
}
}
