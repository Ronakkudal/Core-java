package Cdac.Com.Acts;

import java.io.*;
import java.time.LocalDate;

enum TranType {
	BUY, SELL
}

class Stock implements Serializable {
	private Integer transId;
	private String symbol;
	private Integer quantity;
	private double price;
	private LocalDate transDate;
	private TranType tranType;

	public Stock(Integer transId, String symbol, Integer quantity, double price, LocalDate transDate, TranType tranType) {
		this.transId = transId;
		this.symbol = symbol;
		this.quantity = quantity;
		this.price = price;
		this.transDate = transDate;
		this.tranType = tranType;
	}

	public Integer getTransId() {
		return transId;
	}

	public String getSymbol() {
		return symbol;
	}

	public LocalDate getTransDate() {
		return transDate;
	}

	@Override
	public String toString() {
		return "Stock{" +
				"transId=" + transId +
				", symbol='" + symbol + '\'' +
				", quantity=" + quantity +
				", price=" + price +
				", transDate=" + transDate +
				", tranType=" + tranType +
				'}';
	}
}