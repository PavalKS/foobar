def solution(l):
        bucket = l[:]
        state=sum(bucket)%3
        while state>0 and bucket:
            if state==1:
                to_remove=set(bucket)&{1,4,7}
                if not to_remove:
                    to_remove=set(bucket)&{2,5,8}
            elif state ==2:
                to_remove=set(bucket)&{2,5,8}
                if not to_remove:
                    to_remove=set(bucket)&{1,4,7}
            
            bucket.remove(min(to_remove))
            state=sum(bucket)%3
            
        sorted_list=sorted(bucket)[::-1]
        number=''.join(str(x) for x in sorted_list)
        return  int(number) if number else 0
    
        print(solution([3,1,4,1]))
        print(solution([3,1,4,1,5,9]))
        print(solution([]))
        print(solution([9,9,9,9]))