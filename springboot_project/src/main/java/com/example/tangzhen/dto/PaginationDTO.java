package com.example.tangzhen.dto;
import lombok.Data;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showEndPage;
    private boolean showNext;
    private Integer page;
    private List<Integer>pages=new ArrayList<>();
    private Integer    totalPage;
    public void setPagination(Integer totalCount, Integer page, Integer size) {
         this.page=page;
         if(totalCount%size==0){
             totalPage=totalCount/size;
         }else {
             totalPage=totalCount/size+1;
         }
        //list中的所有显示页码
         if(page<5){
             for(int i=0;i<7;i++){
                 pages.add(i+1);
             }
         }else{
             for(int i=0;i<7;i++){
                    pages.add(page-3+i);
             }
        }
         //是否展示上一页
         if(page==1){
             showPrevious=false;
         }else{
             showPrevious=true;
         }
         //是否展示下一页
         if(page==totalPage){
             showNext=false;
         }else{
             showNext=true;
         }
         //是否展示第一页
        if(!pages.contains(1)){
            showFirstPage=true;
        }else{
            showFirstPage=false;
        }
        //是否展示最后一页
        if(pages.contains(totalPage)){
            showEndPage=false;
        }else{
            showEndPage=true;
        }


    }
}
