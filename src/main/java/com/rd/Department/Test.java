package com.rd.Department;

public class Test {
    public static void main(String[] args) {

        Department managementDepartment = new Department("Management");
        Department softwareDepartment = new Department("Software");

        Personnel managementPersonnel1 = new Personnel("Sena", "Efe", "Manager 1");
        Personnel managementPersonnel2 = new Personnel("Cagla", "Yildirim", "Manager 2");
        Personnel managementPersonnel3 = new Personnel("Bora", "Tepeli", "Manager 3");

        managementDepartment.addPersonnel(managementPersonnel1);
        managementDepartment.addPersonnel(managementPersonnel2);
        managementDepartment.addPersonnel(managementPersonnel3);

        Personnel softwarePersonnel1 = new Personnel("Emre", "Yesilyurt", "Software Engineer");
        Personnel softwarePersonnel2 = new Personnel("Ali", "Solmaz", "Software Test Engineer");

        softwareDepartment.addPersonnel(softwarePersonnel1);
        softwareDepartment.addPersonnel(softwarePersonnel2);

        System.out.println("\n2023 management department personnels list:\n");
        managementDepartment.listPersonnel();
        System.out.println("\n2023 software department personnels list:\n");
        softwareDepartment.listPersonnel();

        softwareDepartment.removePersonnel(softwarePersonnel1);
        System.out.println("\nOne personnel was removed from software department.. Upgrated software department list for 2024:\n");
        softwareDepartment.listPersonnel();

        Personnel managementEmployee4 = new Personnel("Ibrahim", "Guzel", "Manager 4");
        Personnel managementEmployee5 = new Personnel("Elif", "Efe", "Manager 5");
        Personnel managementEmployee6 = new Personnel("Oguz", "Basaran", "Manager 6");

        managementDepartment.addPersonnel(managementEmployee4);
        managementDepartment.addPersonnel(managementEmployee5);
        managementDepartment.addPersonnel(managementEmployee6);

        System.out.println("\n3 personnels were added for management department.. Upgrated management department list for 2024: \n");
        managementDepartment.listPersonnel();
    }
}

