package com.example.pageMaker;

import lombok.ToString;

@ToString
public class PageMaker {
    private long totalCount;// 전체 게시물 개수
    private int pageNum;// 페이지 번호
    private int contentNum = 10;// 한 페이지에 몇개 보일지
    private long startPage = 1;// 페이지 블록의 시작 페이지
    private long endPage = 5;// 페이지 블록의 끝페이지
    private boolean prev = false;// 이전 페이지 버튼
    private boolean next = false;// 다음 페이지 버튼
    private int currentBlock;// 현재 페이지 블록
    private long lastblock;// 마지막 페이지 블록


    public void prevNext(int pageNum) {
        if (pageNum > 0 && pageNum < 6) {
            setPrev(false);
            setNext(true);
        }
        else if (getLastblock() == getCurrentBlock()) {
            setPrev(true);
            setNext(false);
        }
        else {
            setPrev(true);
            setNext(true);
        }
    }

    public long calcpage(long totalCount , long contentNum) {
        long totalPage = totalCount / contentNum;
        if (totalCount % contentNum > 0) {
            totalPage++;
        }
        return totalPage;
    }

    public long getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getContentNum() {
        return contentNum;
    }

    public void setContentNum(int contentNum) {
        this.contentNum = contentNum;
    }

    public long getStartPage() {
        return startPage;
    }
    public void setStartPage(int currentBlock) {
        this.startPage = (currentBlock * 5) - 4;
        //1 2 3 4 5
        //6 7 8 9 10
        //11 12 13
    }
    public long getEndPage() {
        return endPage;
    }
    public void setEndPage(long getLastBlock, long getCurrentBlock) {
        if (getLastBlock == getCurrentBlock) {
            this.endPage = calcpage(getTotalCount(), getContentNum());
        }
        else {
            this.endPage = getStartPage() + 4;
        }
    }
    public boolean isPrev() {
        return prev;
    }
    public void setPrev(boolean prev) {
        this.prev = prev;
    }
    public boolean isNext() {
        return next;
    }
    public void setNext(boolean next) {
        this.next = next;
    }
    public int getCurrentBlock() {
        return currentBlock;
    }
    public void setCurrentBlock(int pageNum) {
        this.currentBlock = pageNum / 5;
        if (pageNum % 5 > 0) {
            this.currentBlock++;
        }
    }
    public long getLastblock() {
        return lastblock;
    }
    public void setLastblock(long totalCount) {

        this.lastblock = totalCount / (5 * this.contentNum);
        if (totalCount % (5 * this.contentNum) > 0) {
            this.lastblock++;
        }
    }
}




