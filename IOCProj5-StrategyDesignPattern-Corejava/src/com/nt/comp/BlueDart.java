package com.nt.comp;

public final class BlueDart implements courier {
    public BlueDart() {
		System.out.println("BlueDart:0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart courier will deliver order id::"+oid+"order products";
		
		
	}

}
