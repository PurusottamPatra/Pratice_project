package com.simplilean.lockedme;


	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;
	public class VirtualRepostory {
	public static void main(String[] args)throws IOException {
		
		System.out.println("Welcome to Lockedme.com");
		System.out.println("This Application Was Created by Purusottam patra");
		
		
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the file name you want to create: ");
				
				String name=sc.nextLine();
				String path="C:\\Users\\Patra\\OneDrive\\practice\\java";
				//System.out.println(path+name);
				File f1=new File(path+name);
				f1.createNewFile();
				System.out.println("File created");
				
			
			
			System.out.println("Enter the file name that you want to search");
			String name1=sc.nextLine();
			File f3=new File(path+name1);
			
			if(f3.exists()){
				System.out.println("File " + f3.getName() + " exists in the directory");
			}
			else {
		        System.out.println("File do not exists");
		    }
			
			
			
					File f=new File("C:\\Users\\Patra\\OneDrive\\practice\\java");
					String contents[] = f.list();
					
					System.out.println("File List in the current Directory: ");
					for(int i=0;i<contents.length;i++){
						System.out.println(contents[i]);
					}
					
			

			
					System.out.println("Enter the file name that you want to delete: ");
					String name2=sc.nextLine();
					File f2=new File(path+name2);
					
					if(f2.exists()){
						f2.delete();
						System.out.println("File " + f2.getName() + " is deleted");
					}
					else {
				        System.out.println("Delete operation failed");
				    }
			
			System.exit(0);
			
		}



		}

