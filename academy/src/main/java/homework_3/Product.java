package homework_3;



	import java.util.Objects;

	public abstract class Product {
		double price;
		int quantity;
		String name;

		public Product(double price, int quantity, String name) {
			super();
			this.price = price;
			this.quantity = quantity;
			this.name = name;
		}

		public double calcFullPrice() {
			return price * quantity * discount();
		}

		public abstract double discount();

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Product [price=" + price + ", quantity=" + quantity + ", name=" + name + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, price, quantity);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return Objects.equals(name, other.name)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
					&& Double.doubleToLongBits(quantity) == Double.doubleToLongBits(other.quantity);
		}
}
