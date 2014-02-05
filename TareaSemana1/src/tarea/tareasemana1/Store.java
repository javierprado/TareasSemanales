package tarea.tareasemana1;

public class Store {

		String name;
		String address;
		String phone;
		String hoursOfOperation;
		String url;
		String email;
		
		public Store(String name, String address, String phone, String hoursOfOperation, String url, String email)
		{
			this.name=name;
			this.address=address;
			this.phone=phone;
			this.hoursOfOperation=hoursOfOperation;
			this.url=url;
			this.email=email;
			
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public String getAdrress()
		{
			return this.address;
		}
		
		public String getPhone()
		{
			return this.phone;
		}
		
		public String getHoursOfOperation()
		{
			return this.hoursOfOperation;
		}
		
		public String getUrl()
		{
			return this.url;
		}
		
		public String getEmail()
		{
			return this.email;
		}
}
