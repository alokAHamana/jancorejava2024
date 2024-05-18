package com.ag.interviewQuestion;

class Employee implements Cloneable {
    private String name;
    
    public Employee() {
        // Default constructor
    }
    
    public Employee(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen
            throw new InternalError(e);
        }
    }
    
	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null || getClass() != obj.getClass()) return false; Employee
	 * employee = (Employee) obj; return name.equals(employee.name); }
	 * 
	 * @Override public int hashCode() { return name.hashCode(); }
	 */
}

