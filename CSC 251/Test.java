import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test{

	 private double data;

	 

	 public Test(double d) {

		 data = d;
	 }

	

	public int hashCode() {

		final int prime = 31;

		int result = 1;

		result = prime * result;

		return result;
	}

	

	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (obj == null)

			return false;

		if (!(obj instanceof Test))

			return false;

		Test other = (Test) obj;

		if (Math.abs(data - other.data) < .00001)

			return true;

		return false;

	}

}
