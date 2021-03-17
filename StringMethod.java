package CTF01.Java.part2.No7;

public class StringMethod
{

	public static void main(String[] args)
	{
//		กำหนด String เป็นดังนี้
//		String1 = 'You and Me' , String2 = ' you and me '

		String String1 = "You and Me";
		String String2 = " you and me ";
//		1. ทดลองเปรียบเทียบ String 2 String ว่าเป็นค่าเดียวกันหรือไม่
		System.out.print("1. String 2 String : ");
		if (String1.equals(String2))
		{
			System.out.println("เป็นค่าเดียวกัน");
		} else
		{
			System.out.println("ไม่เป็นค่าเดียวกัน");
		}

//		2. ใช้คำสั่งค้นหาคำใน String และ แสดงคำที่ค้นหาบนหน้าจอ
		String check = "Me";
		System.out.println("2. แสดงคำค้นหาบนหน้าจอ : ");
		if (String1.contains(check))
		{
			System.out.println("  " + check + " ค้นเจอใน String1");
		} else
		{
			System.out.println("  " + check + " ค้นไม่เจอใน String1");
		}

		if (String2.contains(check))
		{
			System.out.println("  " + check + " ค้นเจอใน String2");
		} else
		{
			System.out.println("  " + check + " ค้นไม่เจอใน String2");
		}

//		3. ใช้คำสั่งหาความยาวของ String นั้น และ แสดงค่าความยาว String
		System.out.println("3. แสดงค่าความยาว String");
		System.out.println("  ความยาว String1 : " + String1.length());
		System.out.println("  ความยาว String2 : " + String2.length());

//		4. ใช้คำสั่งตัดข้อความ หรือ ตัด String ตำแหน่งที่ 1-4 ออก
		System.out.println("4. ตัด String ตำแหน่งที่ 1-4 ออก");
		System.out.println("  ตัด String1 ตำแหน่งที่ 1-4 คือ " + String1.substring(1, 4));
		System.out.println("  ตัด String2 ตำแหน่งที่ 1-4 คือ " + String2.substring(1, 4));

//		5. ใช้คำสั่งตัดช่องว่างของประโยค
		System.out.println("5. ผลการใช้คำสั่งตัดช่องว่าง");
		System.out.println("  ผลของ String1 : " + String1.trim());
		System.out.println("  ผลของ String2 : " + String2.trim());

//		6. ใช้คำสั่งเปลี่ยน String เป็นพิมพ์ใหญ่ทั้งหมด
		System.out.println("6. เปลี่ยนเป็นพิมพ์ใหญ่ทั้งหมด");
		System.out.println("  String1 : " + String1.toUpperCase());
		System.out.println("  String2 : " + String2.toUpperCase());

//		7. ใช้คำสั่งเปลี่ยน String2 เป็นพิมพ์ใหญ่ทั้งหมด และ ไม่มีช่องว่างซ้ายขวา
//		ด้วยการเขียน code แค่บรรทัดเดียว (ใช้ Chaining)
		System.out.print("7. ผลลัพธ์การใช้ Chaining : ");
		System.out.println(String2.toUpperCase().trim());

	}

}
