package com.myPackage.oops.part5_interfaces.example2;

/**
 * Suppose a scenario where our team is working on some very complex
 * functionality. The team has out-sourced another team or company to implement
 * that functionality. Our team can still continue doing their work assuming a
 * dummy implementation of the algorithm for time being. But when the real
 * implementation is given by another team, they can easily use it without much
 * changes.
 */
public class AlgorithmRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		ComplexAlgorithm algorithm = new DummyAlgorithm();
		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}

}
