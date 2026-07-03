async function saveMember(){

    const name = document.getElementById("name").value;

    const response = await fetch("/members",{
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify({
            name:name
        })
    });

    const data = await response.json();

    document.getElementById("result").innerText =
        "저장 완료 : " + data.name;
}