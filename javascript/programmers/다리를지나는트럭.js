function solution(bridge_length, weight, truck_weights) {
    /* 트럭이 지나가는데 몇초가 걸리는지 구해야함
    최대 bridge_length 대 만큼 올라갈 수 있다
    다리는 weight 이하의 무게만 견딜 수 있다.
    완전히 오르지 않은 트럭의 무게는 무시함
    */
    let answer = 0;
    let bridgeState = []; // 현재 다리 상태
    let bridgeSum = 0; // 현재 다리 무게
    
    // 다리 상태의 길이는 다리의 길이로 정하고 각 값을 0으로 초기화
    for(let i=0; i<bridge_length; i++){
        bridgeState.push(0);
    }
   // 현재 다리를 지나가고 있는 트럭 
    let now_truck = truck_weights.shift();
    // 다리 상태에 트럭을 놓고 앞으로 한칸씩 당기기
    bridgeState.unshift(now_truck);
    bridgeState.pop();
    
    // 다리 무게 증가
    bridgeSum += now_truck;
    
    // 시간 증가
    answer++;
    
    
    // 다리 무게의 합이 0이 되면 모든 트럭이 다리를 건넌 것
    while(bridgeSum){ 
        // 다리에 있는 트럭 이동
        bridgeSum -= bridgeState.pop();
        
        // 일단 다리를 안건넌 트럭 하나 빼고,
        now_truck = truck_weights.shift();
        
        // 다리에 들어갈 수 있으면 큐(다리)에 트럭 넣고 무게 증가
        if(now_truck+bridgeSum<=weight){
            bridgeState.unshift(now_truck);
            bridgeSum+=now_truck;
        }
        // 다리에 들어갈 수 없으면 0을 넣고 뺏던거 다시 트럭집단에 고스란히 넣어줌
        else{
            bridgeState.unshift(0);
            truck_weights.unshift(now_truck);
        }
        answer++;
    }
    
    return answer;
}
