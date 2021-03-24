/**************************************************************      
 * Copyright (c) 2016,
 * All rights reserved.
 * 版 本 号：v1.0
 * 题目描述：快速排序算法，从键盘输入一组整数数组，用快速排序输出排序后的结果
 * 输入描述：请输入要排序的数组：
 *           48 15 24 59 64 79 97 40
 * 程序输出： 48 15 24 59 64 79 97 40
 *			输入的数组是：
 *			48 15 24 59 64 79 97 40
 *			排序后的数组是：
 *			15 24 40 48 59 64 79 97
 *			第二种写法的输出：
 *			排序后的数组是：
 *			15 24 40 48 59 64 79 97
 * 问题分析：1.从键盘输入一个整数字符串，将字符串转化为整数数组
 *       	解决方法：先将字符串用str.split()转化为字符串数组，再将字符串数组转化为整数数组
 * 算法描述：实现快速排序算法的关键在于现在数组中选择一个数字，接下来把数组中的数字分为两部分，比选择的数字小的数字移到数组左边，
 * 			比选择的数字大的数字移到数组的右边。
 * 			1.	设要排序的数组是A[0]……A[N-1]，首先任意选取一个数据（通常选用第一个元素）作为基准点，然后将所有比它小的数都放到它前面，
 * 			所有比它大的数都放到它后面，这个过程称为一趟快速排序，然后采用分治策略，分别以同样的方式排序前面和后面的数据。
 *			2.一趟快速排序的算法是：
 *			1）设置两个变量i、j，排序开始的时候：i=0，j=N-1；
 2）以第一个数组元素作为基准点。
 3）从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于A[i](此时基准点)的值A[j]，将值与A[j]交换；
 4）从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于A[j]（此时基准点）的A[i]，将A[j]与A[i]交换；
 5）循环执行第3、4步，直到i=j;
 6）到此找到基准点的下标，作为分治下标。
 7)重复1-6步骤递归排序前半部分
 8 )重复1-6步骤递归排序后半部分
 * 完成日期：2016-07-24
 * 参考网站：https://blog.csdn.net/gg543012991/article/details/52015181?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522159082643719195239824983%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=159082643719195239824983&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v1~pc_rank_v3-4-52015181.first_rank_ecpm_v1_pc_rank_v3&utm_term=%E6%95%B0%E7%BB%84%E6%8E%92%E5%BA%8F%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F###
 ***************************************************************/


package 数组排序之快速排序;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
class Sort_Array{
    //int[] s;
    //int i,j,key;
    /*构造函数，用于输出用户输入的数组*/
    public Sort_Array(int[] s){
        System.out.println("输入的数组是：");
        for(int i = 0; i <s.length; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
    /*排序函数，参数为要排序的数组、数组的起始，数组的末尾*/
    public void sortfun(int[] arrays,int start, int end){

        if(start>=end){								//判断数组的起始和终止是否相同，相同表示已经都全部排完，返回
            return;
        }
        int i = start;								//i指向数组的起始位
        int j = end;								//j指向数组的末位
        int key = arrays[i];						//选取数组的第一位为关键字key，基准元素
        boolean flag = true;						//设置标志位，用于判断是i++还是j--;这个很重要
        //int temp;
        while(i != j){								//如果i≠j，表示还没有比较完，即即关键字左右两侧还不是最小与最大
            if(flag){
                if(key>arrays[j]){					//从后向前遍历，找到小于key的值，
                    swap(arrays,i,j);				//找到小于key的值后将arrays[i]与此值交换
                    flag = false;
                }else{								//如果没有找到的话j--，向前遍历
                    j--;
                }
            }else{
                if(key<arrays[i]){					//从前向后遍历，找到大于key的值
                    swap(arrays,i,j);				//将此值与arrays[j]进行交换
                    flag = true;
                }else{								//如果没有找到话就将i++,向后遍历
                    i++;
                }
            }
        }
        sprint(arrays);								//打印每次排序后的数组
        sortfun(arrays,start,j-1);					//递归调用，将基准元素的前半段数组再用此方法进行排序，直到所有都排完为止。
        sortfun(arrays,i+1,end);					//递归调用，将基准元素的后半段数组再用此方法进行排序，直到所有都排完为止。
//		sortfun(s[0],s[j],s[0]);
//		sortfun(s[j+1],s[s.length-1],s[j+1]);
    }
    /*交换函数，用于交换数组中的两个值，easy,*/
    public void swap(int[] array,int i,int j){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /*sprint()函数用于打印每次排序后的结果，非必须，但可以显示每次排序情况*/
    public void sprint(int[] arrays){
        System.out.println("排序后的数组是：");
        for(int i = 0; i <arrays.length;i++){
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }

    /*第二种写法：*/
    private int getMiddle(int[] sortArray,int low,int high){
        int key = sortArray[low];
        while(low<high){
            while(low <high && sortArray[high] >= key){
                high--;
            }
            sortArray[low] = sortArray[high];
            while(low < high && sortArray[low] <= key){
                low++;
            }
            sortArray[high] = sortArray[low];
        }
        sortArray[low] = key;
        return low;
    }
    public void quicksort(int[] sortArray, int low,int high){
        if(low<high){
            int middle = getMiddle(sortArray, low, high);
            quicksort(sortArray, low, middle-1);
            quicksort(sortArray, middle+1, high);
        }
        System.out.println("第二种写法的输出：");
        sprint(sortArray);
    }
}
public class 数组排序之快速排序 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);			//从键盘输入数组
        System.out.println("请输入要排序的数组：");
        String str = sc.nextLine();						//将键盘输入转化为字符串
        String[] temp = str.split(" ");					//将字符串用“ ”分开转化为字符串数组
        int[] s = new int[temp.length];					//定义一个整型数组s
        for(int i = 0; i<temp.length; i++){				//将字符串数组强制转化为整型数组
            s[i] = Integer.parseInt(temp[i]);			//这种方法非常巧妙
        }
        Sort_Array sort_array = new Sort_Array(s);		//创建对象，并传入数组s
        sort_array.sortfun(s, 0, s.length-1);			//调用类的方法，用于排序数组

        Sort_Array quickSort = new Sort_Array(s);
        quickSort.quicksort(s, 0, s.length-1);
		
		/*用集合的方法输入不定长数组：
		Scanner scanner = new Scanner(System.in);			//创建输入扫描器
		System.out.println("请输入要排序的数组：");
		List  list = new LinkedList();
		while(scanner.hasNext()){						//循环，当扫描到有下一个元素的时候
			int elements = scanner.nextInt();				//获得下一个元素并作为整数
			if(elements == 0){								//如果等于0,则输入结束
				break;									//退出while循环
			}else{
				list.add(elements);						//否则放入集合中
			}
		}
		Integer[] intArray =  list.toArray(new Integer[0]);
		for(int i = 0; i<intArray.length;i++){
			System.out.println(intArray[i]);
		}
	*/
    }
}